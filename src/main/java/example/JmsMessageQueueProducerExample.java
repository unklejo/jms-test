package example;

import java.io.FileReader;
import java.net.URISyntaxException;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Message;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JmsMessageQueueProducerExample {
	
	public static void main(String[] args) throws URISyntaxException, Exception {
		Connection connection = null;
		try {
			// Producer
			ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(
					"tcp://localhost:61616");
			connection = connectionFactory.createConnection();
			Session session = connection.createSession(false,
					Session.AUTO_ACKNOWLEDGE);
			
			////// VARIABLE - change here
			// String queueName = "hermes:employee.create";
			// String queueName = "hermes:employee.update";
			// String queueName = "hermes:booking-preauth.create";
			// String queueName = "hermes:booking-preauth.confirm";
			// String queueName = "hermes:booking-preauth.delete";
			String queueName = "hermes:booking-transaction.update";
			// String filename = "employee.json";
			// String filename = "booking-preauth.json";
			// String filename = "delete-booking-preauth.json";
			// String filename = "update-booking-transaction.json";
			String filename = "smailing-transaction.json";

			Queue queue = session.createQueue(queueName);
			String payload = createJsonFromFile(filename);

			Message msg = session.createTextMessage(payload);
			MessageProducer producer = session.createProducer(queue);
			System.out.println("Sending text '" + payload + "'");
			producer.send(msg);

			session.close();
		} finally {
			if (connection != null) {
				connection.close();
			}
		}
	}

	private static String createJsonFromFile(String filename) {
		JSONParser parser = new JSONParser();

		try {
			String absolutePath = "/home/jhovie/Documents/Project/DMSM/_GITREPO/Jhovie/jms-test/src/main/java/example/jsonfile/";
			String path = absolutePath + filename;
			Object obj = parser.parse(new FileReader(path));
			JSONObject jsonObject = (JSONObject) obj;
			return jsonObject.toJSONString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}


//	private static String createJsonRequestMPM() {
//		MPMQueueMessage pojo = new MPMQueueMessage();
//		pojo.setOrderNumber(10001);
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
//		pojo.setCreated(sdf.format(new Date()));
		
//		return (new Gson()).toJson(pojo, MPMQueueMessage.class).toString();
//	}
}


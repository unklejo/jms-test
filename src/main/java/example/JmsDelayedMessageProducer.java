package example;

import java.io.FileReader;
import java.net.URISyntaxException;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.ScheduledMessage;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JmsDelayedMessageProducer {
	
	public static void main(String[] args) throws URISyntaxException, Exception {
		Connection connection = null;
		try {
			// Producer
			ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(
					"tcp://localhost:61616");
			connection = connectionFactory.createConnection();
			Session session = connection.createSession(false,
					Session.AUTO_ACKNOWLEDGE);
			
			//VARIABLE - change here
			String queueName = "hermes:employee.create";
			String filename = "jsonfile/employee.json";

			String payload = createJsonFromFile(filename);

			TextMessage msg = session.createTextMessage(payload);
			long value = 20000;
			msg.setLongProperty(ScheduledMessage.AMQ_SCHEDULED_DELAY, value);
			System.out.println("Sending text '" + payload + "'");

			Queue queue = session.createQueue(queueName);
			MessageProducer producer = session.createProducer(queue);
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
			String path = "/home/jhovie/Documents/Project/DMSM/_GITREPO/Jhovie/test3/src/main/java/dmsum/" + filename;
			Object obj = parser.parse(new FileReader(path));
			JSONObject jsonObject = (JSONObject) obj;
			return jsonObject.toJSONString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}


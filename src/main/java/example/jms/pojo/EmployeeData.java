package example.jms.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import org.springframework.stereotype.Component;

@Component
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmployeeData {
  
  @JsonProperty("id")
  private String id;

  @JsonProperty("is_active")
  private boolean isActive;

  @JsonProperty("title")
  private String title;

  @JsonProperty("address")
  private String address;

  @JsonProperty("city")
  private String city;

  @JsonProperty("date_of_birth")
  private Date dateOfBirth;

  @JsonProperty("email_to")
  private String emailTo;

  @JsonProperty("email_cc")
  private String emailCc;

  @JsonProperty("employee_code")
  private String employeeCode;

  @JsonProperty("first_name")
  private String firstName;

  @JsonProperty("last_name")
  private String lastName;

  @JsonProperty("full_name")
  private String fullName;

  @JsonProperty("gender")
  private String gender;

  @JsonProperty("meal")
  private String meal;

  @JsonProperty("mobile_phone_number")
  private String mobilePhoneNumber;

  @JsonProperty("national_id")
  private String nationalId;

  @JsonProperty("national_id_attachment")
  private String nationalIdAttachment;

  @JsonProperty("nationality")
  private String nationality;

  @JsonProperty("is_override_airline")
  private String isOverrideAirline;

  @JsonProperty("is_override_hotel")
  private String isOverrideHotel;

  @JsonProperty("phone_number")
  private String phoneNumber;

  @JsonProperty("postal_code")
  private String postalCode;

  @JsonProperty("preferred_airline_1")
  private boolean preferredAirline1;

  @JsonProperty("preferred_airline_2")
  private boolean preferredAirline2;

  @JsonProperty("seat")
  private String seat;

  @JsonProperty("department_code")
  private String departmentCode;

  @JsonProperty("department_alias")
  private String departmentAlias;

  @JsonProperty("department_name")
  private String departmentName;

  @JsonProperty("division_code")
  private String divisionCode;

  @JsonProperty("division_name")
  private String divisionName;

  @JsonProperty("division_alias")
  private String divisionAlias;

  @JsonProperty("division_id")
  private String divisionId;

  @JsonProperty("position_code")
  private String positionCode;

  @JsonProperty("position_name")
  private String positionName;

  @JsonProperty("position_alias")
  private String positionAlias;

  /**
   * @return String return the id
   */
  public String getId() {
      return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(String id) {
      this.id = id;
  }

  /**
   * @return boolean return the isActive
   */
  public boolean isIsActive() {
      return isActive;
  }

  /**
   * @param isActive the isActive to set
   */
  public void setIsActive(boolean isActive) {
      this.isActive = isActive;
  }

  /**
   * @return String return the title
   */
  public String getTitle() {
      return title;
  }

  /**
   * @param title the title to set
   */
  public void setTitle(String title) {
      this.title = title;
  }

  /**
   * @return String return the address
   */
  public String getAddress() {
      return address;
  }

  /**
   * @param address the address to set
   */
  public void setAddress(String address) {
      this.address = address;
  }

  /**
   * @return String return the city
   */
  public String getCity() {
      return city;
  }

  /**
   * @param city the city to set
   */
  public void setCity(String city) {
      this.city = city;
  }

  /**
   * @return Date return the dateOfBirth
   */
  public Date getDateOfBirth() {
      return dateOfBirth;
  }

  /**
   * @param dateOfBirth the dateOfBirth to set
   */
  public void setDateOfBirth(Date dateOfBirth) {
      this.dateOfBirth = dateOfBirth;
  }

  /**
   * @return String return the emailTo
   */
  public String getEmailTo() {
      return emailTo;
  }

  /**
   * @param emailTo the emailTo to set
   */
  public void setEmailTo(String emailTo) {
      this.emailTo = emailTo;
  }

  /**
   * @return String return the emailCc
   */
  public String getEmailCc() {
      return emailCc;
  }

  /**
   * @param emailCc the emailCc to set
   */
  public void setEmailCc(String emailCc) {
      this.emailCc = emailCc;
  }

  /**
   * @return String return the employeeCode
   */
  public String getEmployeeCode() {
      return employeeCode;
  }

  /**
   * @param employeeCode the employeeCode to set
   */
  public void setEmployeeCode(String employeeCode) {
      this.employeeCode = employeeCode;
  }

  /**
   * @return String return the firstName
   */
  public String getFirstName() {
      return firstName;
  }

  /**
   * @param firstName the firstName to set
   */
  public void setFirstName(String firstName) {
      this.firstName = firstName;
  }

  /**
   * @return String return the lastName
   */
  public String getLastName() {
      return lastName;
  }

  /**
   * @param lastName the lastName to set
   */
  public void setLastName(String lastName) {
      this.lastName = lastName;
  }

  /**
   * @return String return the fullName
   */
  public String getFullName() {
      return fullName;
  }

  /**
   * @param fullName the fullName to set
   */
  public void setFullName(String fullName) {
      this.fullName = fullName;
  }

  /**
   * @return String return the gender
   */
  public String getGender() {
      return gender;
  }

  /**
   * @param gender the gender to set
   */
  public void setGender(String gender) {
      this.gender = gender;
  }

  /**
   * @return String return the meal
   */
  public String getMeal() {
      return meal;
  }

  /**
   * @param meal the meal to set
   */
  public void setMeal(String meal) {
      this.meal = meal;
  }

  /**
   * @return String return the mobilePhoneNumber
   */
  public String getMobilePhoneNumber() {
      return mobilePhoneNumber;
  }

  /**
   * @param mobilePhoneNumber the mobilePhoneNumber to set
   */
  public void setMobilePhoneNumber(String mobilePhoneNumber) {
      this.mobilePhoneNumber = mobilePhoneNumber;
  }

  /**
   * @return String return the nationalId
   */
  public String getNationalId() {
      return nationalId;
  }

  /**
   * @param nationalId the nationalId to set
   */
  public void setNationalId(String nationalId) {
      this.nationalId = nationalId;
  }

  /**
   * @return String return the nationalIdAttachment
   */
  public String getNationalIdAttachment() {
      return nationalIdAttachment;
  }

  /**
   * @param nationalIdAttachment the nationalIdAttachment to set
   */
  public void setNationalIdAttachment(String nationalIdAttachment) {
      this.nationalIdAttachment = nationalIdAttachment;
  }

  /**
   * @return String return the nationality
   */
  public String getNationality() {
      return nationality;
  }

  /**
   * @param nationality the nationality to set
   */
  public void setNationality(String nationality) {
      this.nationality = nationality;
  }

  /**
   * @return String return the isOverrideAirline
   */
  public String getIsOverrideAirline() {
      return isOverrideAirline;
  }

  /**
   * @param isOverrideAirline the isOverrideAirline to set
   */
  public void setIsOverrideAirline(String isOverrideAirline) {
      this.isOverrideAirline = isOverrideAirline;
  }

  /**
   * @return String return the isOverrideHotel
   */
  public String getIsOverrideHotel() {
      return isOverrideHotel;
  }

  /**
   * @param isOverrideHotel the isOverrideHotel to set
   */
  public void setIsOverrideHotel(String isOverrideHotel) {
      this.isOverrideHotel = isOverrideHotel;
  }

  /**
   * @return String return the phoneNumber
   */
  public String getPhoneNumber() {
      return phoneNumber;
  }

  /**
   * @param phoneNumber the phoneNumber to set
   */
  public void setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
  }

  /**
   * @return String return the postalCode
   */
  public String getPostalCode() {
      return postalCode;
  }

  /**
   * @param postalCode the postalCode to set
   */
  public void setPostalCode(String postalCode) {
      this.postalCode = postalCode;
  }

  /**
   * @return boolean return the preferredAirline1
   */
  public boolean isPreferredAirline1() {
      return preferredAirline1;
  }

  /**
   * @param preferredAirline1 the preferredAirline1 to set
   */
  public void setPreferredAirline1(boolean preferredAirline1) {
      this.preferredAirline1 = preferredAirline1;
  }

  /**
   * @return boolean return the preferredAirline2
   */
  public boolean isPreferredAirline2() {
      return preferredAirline2;
  }

  /**
   * @param preferredAirline2 the preferredAirline2 to set
   */
  public void setPreferredAirline2(boolean preferredAirline2) {
      this.preferredAirline2 = preferredAirline2;
  }

  /**
   * @return String return the seat
   */
  public String getSeat() {
      return seat;
  }

  /**
   * @param seat the seat to set
   */
  public void setSeat(String seat) {
      this.seat = seat;
  }

  /**
   * @return String return the departmentCode
   */
  public String getDepartmentCode() {
      return departmentCode;
  }

  /**
   * @param departmentCode the departmentCode to set
   */
  public void setDepartmentCode(String departmentCode) {
      this.departmentCode = departmentCode;
  }

  /**
   * @return String return the departmentAlias
   */
  public String getDepartmentAlias() {
      return departmentAlias;
  }

  /**
   * @param departmentAlias the departmentAlias to set
   */
  public void setDepartmentAlias(String departmentAlias) {
      this.departmentAlias = departmentAlias;
  }

  /**
   * @return String return the departmentName
   */
  public String getDepartmentName() {
      return departmentName;
  }

  /**
   * @param departmentName the departmentName to set
   */
  public void setDepartmentName(String departmentName) {
      this.departmentName = departmentName;
  }

  /**
   * @return String return the divisionCode
   */
  public String getDivisionCode() {
      return divisionCode;
  }

  /**
   * @param divisionCode the divisionCode to set
   */
  public void setDivisionCode(String divisionCode) {
      this.divisionCode = divisionCode;
  }

  /**
   * @return String return the divisionName
   */
  public String getDivisionName() {
      return divisionName;
  }

  /**
   * @param divisionName the divisionName to set
   */
  public void setDivisionName(String divisionName) {
      this.divisionName = divisionName;
  }

  /**
   * @return String return the divisionAlias
   */
  public String getDivisionAlias() {
      return divisionAlias;
  }

  /**
   * @param divisionAlias the divisionAlias to set
   */
  public void setDivisionAlias(String divisionAlias) {
      this.divisionAlias = divisionAlias;
  }

  /**
   * @return String return the divisionId
   */
  public String getDivisionId() {
      return divisionId;
  }

  /**
   * @param divisionId the divisionId to set
   */
  public void setDivisionId(String divisionId) {
      this.divisionId = divisionId;
  }

  /**
   * @return String return the positionCode
   */
  public String getPositionCode() {
      return positionCode;
  }

  /**
   * @param positionCode the positionCode to set
   */
  public void setPositionCode(String positionCode) {
      this.positionCode = positionCode;
  }

  /**
   * @return String return the positionName
   */
  public String getPositionName() {
      return positionName;
  }

  /**
   * @param positionName the positionName to set
   */
  public void setPositionName(String positionName) {
      this.positionName = positionName;
  }

  /**
   * @return String return the positionAlias
   */
  public String getPositionAlias() {
      return positionAlias;
  }

  /**
   * @param positionAlias the positionAlias to set
   */
  public void setPositionAlias(String positionAlias) {
      this.positionAlias = positionAlias;
  }

}

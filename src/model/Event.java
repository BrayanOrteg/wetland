package model;
public class Event {


	/**
    *  Description: this var saves the type of event
    * */
	private String type; 

	/**
    *  Description: this var saves the description of the event
    * */
	private String description;
	/**
    *  Description: this var saves the price
    * */
	private double price;
	/**
    *  Description: this var saves the client of the event
    * */
	private String client;
	/**
    *  Description: this var saves the date
    * */
	private Date date;



	/**
	* Description: This is the method constructor for Event 
	* @param type <String>, must be initialized
	* @param description <String>, must be initialized
	* @param price <double>, must be initialized and price !=null
	* @param client <String>, must be initialized
	* @param date <Date>, must be initialized and date !=empty
	*/

	public Event(String type, String description, double price, String client, Date date){

		this.type=type;
		this.description=description;
		this.price=price;
		this.client=client;
		this.date=date;

	}


	/**
    * Description: This method is the toString of the class for print the values
    * @return <String>, 
    */

	public String toString(){
		return (type+"\n "+description+"\n "+price+"\n "+client+"\n "+date);
	}


	public String getType() {
		return type;
	}

	public String getDescription() {
		return description;
	}

	public Double getPrice() {
		return price;
	}

		/**
	 * 
	 * @param price
	 */

	public void setPrice(double price){

		this.price=price;
	}

	public String getClient() {
		return client;
	}

	public Date getDate() {
		return date;
	}


		/**
	 * Description: Method set for the date
	 * @param date
	 */

	public void setDate(Date date){

		this.date=date;
	}

}
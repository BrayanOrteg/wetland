package model;
public class Date {

	/**
    *  this var saves the day
    * */
	private int day;

	/**
    *  this var saves the month
    * */
	private int month;

	/**
    *  this var saves the year
    * */
	private int year;


	/**
	* Description: This is the method constructor for Date
	* @param day <int>, must be initialized and day !=null
	* @param month <int>, must be initialized and month !=null
	* @param year <int>, must be initialized and year !=null
	*/

	public Date(int day, int month, int year) {
		this.day=day;
		this.month=month;
		this.year=year;
	}

	/**
    * Description: This method is the toString of the class for print the values
    * @return <String>, 
    */
	public String toString(){

		return (day+"/"+month+"/"+year);
	}


	public int getDay (){
		return day;
	}
	
	public int getMonth (){
		return month;
	}
	
	public int getYear (){
		return year;
	}
	

	/**
	 * 
	 * @param day
	 */

	public void setDay (int day){
		this.day=day;
	}
	
		/**
	 * 
	 * @param month
	 */	

	public void setMonth (int month){
		this.month=month;
	}

		/**
	 * 
	 * @param year
	 */
	
	public void setYear (int year){
		this.year=year;
	}




}
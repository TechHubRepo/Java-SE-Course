package com.techhub.demo.jdbc.constant;

/**
 * The TableDMLStatements class
 * 
 * @author ramniwash
 *
 */
public class TableDMLStatements {

	/** The SUPPLIERS_INSERT_DML */
	public static final String SUPPLIERS_INSERT_DML[] = {
			"INSERT INTO SUPPLIERS VALUES(49, 'Superior Coffee', '1 Party Place', 'Mendocino', 'CA', '95460');",
			"INSERT INTO SUPPLIERS (SUP_ID, SUP_NAME, STREET, CITY, STATE, ZIP) VALUES(101, 'Acme, Inc.', '99 Market Street','Groundsville', 'CA', '95199');",
			"INSERT INTO SUPPLIERS VALUES(150, 'The High Ground', '100 Coffee Lane', 'Meadows', 'CA', '93966');" };

	/** The COFFEES_INSERT_DML */
	public static final String COFFEES_INSERT_DML[] = { "INSERT INTO COFFEES VALUES('Colombian', 00101, 7.99, 0, 0);",
			"INSERT INTO COFFEES VALUES('French_Roast', 00049, 8.99, 0, 0);",
			"INSERT INTO COFFEES VALUES('Espresso', 00150, 9.99, 0, 0);",
			"INSERT INTO COFFEES VALUES('Colombian_Decaf', 00101, 8.99, 0, 0);",
			"INSERT INTO COFFEES VALUES('French_Roast_Decaf', 00049, 9.99, 0, 0);" };

	/** The COF_INVENTORY_INSERT_DML */
	public static final String COF_INVENTORY_INSERT_DML[] = {
			"INSERT INTO COF_INVENTORY VALUES(1234,'House_Blend',49,0,'2006_04_01');",
			"INSERT INTO COF_INVENTORY VALUES(1234,'House_Blend_Decaf',49,0,'2006_04_01');",
			"INSERT INTO COF_INVENTORY VALUES(1234,'Colombian',101,0,'2006_04_01');",
			"INSERT INTO COF_INVENTORY VALUES(1234,'French_Roast',49,0,'2006_04_01');",
			"INSERT INTO COF_INVENTORY VALUES(1234,'Espresso',150,0,'2006_04_01');",
			"INSERT INTO COF_INVENTORY VALUES(1234,'Colombian_Decaf',101,0,'2006_04_01');", };

	/** The MERCH_INVENTORY_INSERT_DML */
	public static final String MERCH_INVENTORY_INSERT_DML[] = {
			"INSERT INTO MERCH_INVENTORY VALUES(00001234,'Cup_Large',101,28,'2006_04_01');",
			"INSERT INTO MERCH_INVENTORY VALUES(00001235,'Cup_Small',49,36,'2006_04_01');",
			"INSERT INTO MERCH_INVENTORY VALUES(00001236,'Saucer',150,64,'2006_04_01');",
			"INSERT INTO MERCH_INVENTORY VALUES(00001287,'Carafe',101,12,'2006_04_01');",
			"INSERT INTO MERCH_INVENTORY VALUES(00006931,'Carafe',150,3,'2006_04_01');",
			"INSERT INTO MERCH_INVENTORY VALUES(00006935,'PotHolder',101,88,'2006_04_01');",
			"INSERT INTO MERCH_INVENTORY VALUES(00006977,'Napkin',49,108,'2006_04_01');",
			"INSERT INTO MERCH_INVENTORY VALUES(00006979,'Towel',150,24,'2006_04_01');",
			"INSERT INTO MERCH_INVENTORY VALUES(00004488,'CofMaker',49,5,'2006_04_01');",
			"INSERT INTO MERCH_INVENTORY VALUES(00004490,'CofGrinder',150,9,'2006_04_01');",
			"INSERT INTO MERCH_INVENTORY VALUES(00004495,'EspMaker',101,4,'2006_04_01');",
			"INSERT INTO MERCH_INVENTORY VALUES(00006914,'Cookbook',49,12,'2006_04_01');", };

	/** The COFFEE_HOUSES_INSERT_DML */
	public static final String COFFEE_HOUSES_INSERT_DML[] = {
			"INSERT INTO COFFEE_HOUSES VALUES(10023,'Mendocino',3450,2005,5455);",
			"INSERT INTO COFFEE_HOUSES VALUES(33002,'Seattle',4699,3109,7808);",
			"INSERT INTO COFFEE_HOUSES VALUES(10040,'SF',5386,2841,8227);",
			"INSERT INTO COFFEE_HOUSES VALUES(32001,'Portland',3147,3579,6726);",
			"INSERT INTO COFFEE_HOUSES VALUES(10042,'SF',2863,1874,4710);",
			"INSERT INTO COFFEE_HOUSES VALUES(10024,'Sacramento',1987,2341,4328);",
			"INSERT INTO COFFEE_HOUSES VALUES(10039,'Carmel',2691,1121,3812);",
			"INSERT INTO COFFEE_HOUSES VALUES(10041,'LA',1533,1007,2540);",
			"INSERT INTO COFFEE_HOUSES VALUES(33005,'Olympia',2733,1550,4283);",
			"INSERT INTO COFFEE_HOUSES VALUES(33010,'Seattle',3210,2177,5387);",
			"INSERT INTO COFFEE_HOUSES VALUES(10035,'SF',1922,1056,2978);",
			"INSERT INTO COFFEE_HOUSES VALUES(10037,'LA',2143,1876,4019);",
			"INSERT INTO COFFEE_HOUSES VALUES(10034,'San_Jose',1234,1032,2266);",
			"INSERT INTO COFFEE_HOUSES VALUES(32004,'Eugene',1356,1112,2468);", };

	/** The CUSTOMER_INSERT_DML */
	public static final String CUSTOMER_INSERT_DML[] = {
			"INSERT INTO CUSTOMER VALUES(0,'Shivam Kumar',123456789,25000);",
			"INSERT INTO CUSTOMER VALUES(0,'Krishan Kumar',987654321,60000);" };
	
	/** The NEW_CUSTOMER_INSERT_DML */
	public static final String NEW_CUSTOMER_INSERT_DML[] = {
			"INSERT INTO CUSTOMER VALUES(0,'Sajjan Kumar',77777777,8000);",
			"INSERT INTO CUSTOMER VALUES(0,'Prem Kumar',66666666,3000);",
			"INSERT INTO CUSTOMER VALUES(0,'Kulddep Singh',8888888,2000);",
			"INSERT INTO CUSTOMER VALUES(0,'Naresh Kumar',2222222,5000);",
			"INSERT INTO CUSTOMER VALUES(0,'Diwer Gupta',5555555,1500);",
			"INSERT INTO CUSTOMER VALUES(0,'Purshtom Dass',4444444,4000);",
			"INSERT INTO CUSTOMER VALUES(0,'Naveen Dass',333333,7000);"};

	/** The SELECT_COFFEES_BY_SUP_ID_QUERY */
	public static final String SELECT_COFFEES_BY_SUP_ID_DML = "SELECT * FROM COFFEES WHERE SUP_ID=?";

	/** Private constructor to avoid object creation */
	private TableDMLStatements() {
	}
}
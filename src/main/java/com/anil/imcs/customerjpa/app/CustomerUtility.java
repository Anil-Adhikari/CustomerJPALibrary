package com.anil.imcs.customerjpa.app;


import java.util.ArrayList;
import java.util.List;

import com.anil.imcs.customerjpa.entity.Address;
import com.anil.imcs.customerjpa.entity.Customer;


public class CustomerUtility {
	
	
/*	SET @row_number = 0;

	SELECT 
	    CONCAT('Customer cust', @row_number, '= new Customer(' , customerNumber , ', \"' , contactFirstName , ' ' , contactLastName , '\",' , IFNULL(creditLimit, 'null'), ',' , IFNULL(salesRepEmployeeNumber, 'null'), ',\"' , phone , '\",' , 'new Address(\"', addressLine1 , '\",\"',  IFNULL(addressLine2, 'null'), '\",\"',  city , '\",\"',  IFNULL(state, 'null') , '\",\"', IFNULL(postalcode, 'null') , '\",\"',  country , '\"));' )
	FROM
	    classicmodels.customers*/
	    
	public static List<Customer> getCustomers() {
		List<Customer> customerList = new ArrayList<Customer>();
		customerList.add(new Customer(103, "Carine  Schmitt",21000.00,1370,"40.32.2555",new Address("54, rue Royale",null,"Nantes",null,"44000","France")));
		customerList.add(new Customer(112, "Jean King",71800.00,1166,"7025551838",new Address("8489 Strong St.",null,"Las Vegas","NV","83030","USA")));
		customerList.add(new Customer(114, "Peter Ferguson",117300.00,1611,"03 9520 4555",new Address("636 St Kilda Road","Level 3","Melbourne","Victoria","3004","Australia")));
		customerList.add(new Customer(119, "Janine  Labrune",118200.00,1370,"40.67.8555",new Address("67, rue des Cinquante Otages",null,"Nantes",null,"44000","France")));
		customerList.add(new Customer(121, "Jonas  Bergulfsen",81700.00,1504,"07-98 9555",new Address("Erling Skakkes gate 78",null,"Stavern",null,"4110","Norway")));
		customerList.add(new Customer(124, "Susan Nelson",210500.00,1165,"4155551450",new Address("5677 Strong St.",null,"San Rafael","CA","97562","USA")));
		customerList.add(new Customer(125, "Zbyszek  Piestrzeniewicz",0.00,null,"(26) 642-7555",new Address("ul. Filtrowa 68",null,"Warszawa",null,"01-012","Poland")));
		customerList.add(new Customer(128, "Roland Keitel",59700.00,1504,"+49 69 66 90 2555",new Address("Lyonerstr. 34",null,"Frankfurt",null,"60528","Germany")));
		customerList.add(new Customer(129, "Julie Murphy",64600.00,1165,"6505555787",new Address("5557 North Pendale Street",null,"San Francisco","CA","94217","USA")));
		customerList.add(new Customer(131, "Kwai Lee",114900.00,1323,"2125557818",new Address("897 Long Airport Avenue",null,"NYC","NY","10022","USA")));
		customerList.add(new Customer(141, "Diego  Freyre",227600.00,1370,"(91) 555 94 44",new Address("C/ Moralzarzal, 86",null,"Madrid",null,"28034","Spain")));
		customerList.add(new Customer(144, "Christina  Berglund",53100.00,1504,"0921-12 3555",new Address("Berguvsv�gen  8",null,"Lule�",null,"S-958 22","Sweden")));
		customerList.add(new Customer(145, "Jytte  Petersen",83400.00,1401,"31 12 3555",new Address("Vinb�ltet 34",null,"Kobenhavn",null,"1734","Denmark")));
		customerList.add(new Customer(146, "Mary  Saveley",123900.00,1337,"78.32.5555",new Address("2, rue du Commerce",null,"Lyon",null,"69004","France")));
		customerList.add(new Customer(148, "Eric Natividad",103800.00,1621,"+65 221 7555",new Address("Bronz Sok.","Bronz Apt. 3/6 Tesvikiye","Singapore",null,"079903","Singapore")));
		customerList.add(new Customer(151, "Jeff Young",138500.00,1286,"2125557413",new Address("4092 Furth Circle","Suite 400","NYC","NY","10022","USA")));
		customerList.add(new Customer(157, "Kelvin Leong",100600.00,1216,"2155551555",new Address("7586 Pompton St.",null,"Allentown","PA","70267","USA")));
		customerList.add(new Customer(161, "Juri Hashimoto",84600.00,1165,"6505556809",new Address("9408 Furth Circle",null,"Burlingame","CA","94217","USA")));
		customerList.add(new Customer(166, "Wendy Victorino",97900.00,1612,"+65 224 1555",new Address("106 Linden Road Sandown","2nd Floor","Singapore",null,"069045","Singapore")));
		customerList.add(new Customer(167, "Veysel Oeztan",96800.00,1504,"+47 2267 3215",new Address("Brehmen St. 121","PR 334 Sentrum","Bergen",null,"N 5804","Norway  ")));
		customerList.add(new Customer(168, "Keith Franco",0.00,1286,"2035557845",new Address("149 Spinnaker Dr.","Suite 101","New Haven","CT","97823","USA")));
		customerList.add(new Customer(169, "Isabel  de Castro",0.00,null,"(1) 356-5555",new Address("Estrada da sa�de n. 58",null,"Lisboa",null,"1756","Portugal")));
		customerList.add(new Customer(171, "Martine  Ranc�",82900.00,1370,"20.16.1555",new Address("184, chauss�e de Tournai",null,"Lille",null,"59000","France")));
		customerList.add(new Customer(172, "Marie Bertrand",84300.00,1337,"(1) 42.34.2555",new Address("265, boulevard Charonne",null,"Paris",null,"75012","France")));
		customerList.add(new Customer(173, "Jerry Tseng",43400.00,1188,"6175555555",new Address("4658 Baden Av.",null,"Cambridge","MA","51247","USA")));
		customerList.add(new Customer(175, "Julie King",84300.00,1323,"2035552570",new Address("25593 South Bay Ln.",null,"Bridgewater","CT","97562","USA")));
		customerList.add(new Customer(177, "Mory Kentary",81200.00,1621,"+81 06 6342 5555",new Address("1-6-20 Dojima",null,"Kita-ku","Osaka"," 530-0003","Japan")));
		customerList.add(new Customer(181, "Michael Frick",76400.00,1286,"2125551500",new Address("2678 Kingston Rd.","Suite 101","NYC","NY","10022","USA")));
		customerList.add(new Customer(186, "Matti Karttunen",96500.00,1501,"90-224 8555",new Address("Keskuskatu 45",null,"Helsinki",null,"21240","Finland")));
		customerList.add(new Customer(187, "Rachel Ashworth",136800.00,1501,"(171) 555-1555",new Address("Fauntleroy Circus",null,"Manchester",null,"EC2 5NT","UK")));
		customerList.add(new Customer(189, "Dean Cassidy",69400.00,1504,"+353 1862 1555",new Address("25 Maiden Lane","Floor No. 4","Dublin",null,"2","Ireland")));
		customerList.add(new Customer(198, "Leslie Taylor",23000.00,1216,"6175558428",new Address("16780 Pompton St.",null,"Brickhaven","MA","58339","USA")));
		customerList.add(new Customer(201, "Elizabeth Devon",92700.00,1501,"(171) 555-2282",new Address("12, Berkeley Gardens Blvd",null,"Liverpool",null,"WX1 6LT","UK")));
		customerList.add(new Customer(202, "Yoshi  Tamuri",90300.00,1323,"(604) 555-3392",new Address("1900 Oak St.",null,"Vancouver","BC","V3F 2K1","Canada")));
		customerList.add(new Customer(204, "Miguel Barajas",68700.00,1188,"6175557555",new Address("7635 Spinnaker Dr.",null,"Brickhaven","MA","58339","USA")));
		customerList.add(new Customer(205, "Julie Young",90700.00,1166,"6265557265",new Address("78934 Hillside Dr.",null,"Pasadena","CA","90003","USA")));
		customerList.add(new Customer(206, "Brydey Walker",0.00,null,"+612 9411 1555",new Address("Suntec Tower Three","8 Temasek","Singapore",null,"038988","Singapore")));
		customerList.add(new Customer(209, "Fr�d�rique  Citeaux",53800.00,1370,"88.60.1555",new Address("24, place Kl�ber",null,"Strasbourg",null,"67000","France")));
		customerList.add(new Customer(211, "Mike Gao",58600.00,1621,"+852 2251 1555",new Address("Bank of China Tower","1 Garden Road","Central Hong Kong",null,null,"Hong Kong")));
		customerList.add(new Customer(216, "Eduardo  Saavedra",60300.00,1702,"(93) 203 4555",new Address("Rambla de Catalu�a, 23",null,"Barcelona",null,"08022","Spain")));
		customerList.add(new Customer(219, "Mary Young",11000.00,1166,"3105552373",new Address("4097 Douglas Av.",null,"Glendale","CA","92561","USA")));
		customerList.add(new Customer(223, "Horst  Kloss",0.00,null,"0372-555188",new Address("Taucherstra�e 10",null,"Cunewalde",null,"01307","Germany")));
		customerList.add(new Customer(227, "Palle Ibsen",120800.00,1401,"86 21 3555",new Address("Smagsloget 45",null,"�rhus",null,"8200","Denmark")));
		customerList.add(new Customer(233, "Jean  Fresni�re",48700.00,1286,"(514) 555-8054",new Address("43 rue St. Laurent",null,"Montr�al","Qu�bec","H1J 1C3","Canada")));
		customerList.add(new Customer(237, "Alejandra  Camino",0.00,null,"(91) 745 6555",new Address("Gran V�a, 1",null,"Madrid",null,"28001","Spain")));
		customerList.add(new Customer(239, "Valarie Thompson",105000.00,1166,"7605558146",new Address("361 Furth Circle",null,"San Diego","CA","91217","USA")));
		customerList.add(new Customer(240, "Helen  Bennett",93900.00,1501,"(198) 555-8888",new Address("Garden House","Crowther Way 23","Cowes","Isle of Wight","PO31 7PJ","UK")));
		customerList.add(new Customer(242, "Annette  Roulet",61100.00,1370,"61.77.6555",new Address("1 rue Alsace-Lorraine",null,"Toulouse",null,"31000","France")));
		customerList.add(new Customer(247, "Renate  Messner",0.00,null,"069-0555984",new Address("Magazinweg 7",null,"Frankfurt",null,"60528","Germany")));
		customerList.add(new Customer(249, "Paolo  Accorti",113000.00,1401,"011-4988555",new Address("Via Monte Bianco 34",null,"Torino",null,"10100","Italy")));
		customerList.add(new Customer(250, "Daniel Da Silva",68100.00,1337,"+33 1 46 62 7555",new Address("27 rue du Colonel Pierre Avia",null,"Paris",null,"75508","France")));
		customerList.add(new Customer(256, "Daniel  Tonini",77900.00,1370,"30.59.8555",new Address("67, avenue de l'Europe",null,"Versailles",null,"78000","France")));
		customerList.add(new Customer(259, "Henriette  Pfalzheim",120400.00,1504,"0221-5554327",new Address("Mehrheimerstr. 369",null,"K�ln",null,"50739","Germany")));
		customerList.add(new Customer(260, "Elizabeth  Lincoln",89600.00,1323,"(604) 555-4555",new Address("23 Tsawassen Blvd.",null,"Tsawassen","BC","T2F 8M4","Canada")));
		customerList.add(new Customer(273, "Peter  Franken",0.00,null,"089-0877555",new Address("Berliner Platz 43",null,"M�nchen",null,"80805","Germany")));
		customerList.add(new Customer(276, "Anna O'Hara",107800.00,1611,"02 9936 8555",new Address("201 Miller Street","Level 15","North Sydney","NSW","2060","Australia")));
		customerList.add(new Customer(278, "Giovanni  Rovelli",119600.00,1401,"035-640555",new Address("Via Ludovico il Moro 22",null,"Bergamo",null,"24100","Italy")));
		customerList.add(new Customer(282, "Adrian Huxley",93300.00,1611,"+61 2 9495 8555",new Address("Monitor Money Building","815 Pacific Hwy","Chatswood","NSW","2067","Australia")));
		customerList.add(new Customer(286, "Marta Hernandez",123700.00,1216,"6175558555",new Address("39323 Spinnaker Dr.",null,"Cambridge","MA","51247","USA")));
		customerList.add(new Customer(293, "Ed Harrison",0.00,null,"+41 26 425 50 01",new Address("Rte des Arsenaux 41 ",null,"Fribourg",null,"1700","Switzerland")));
		customerList.add(new Customer(298, "Mihael Holz",141300.00,1702,"0897-034555",new Address("Grenzacherweg 237",null,"Gen�ve",null,"1203","Switzerland")));
		customerList.add(new Customer(299, "Jan Klaeboe",95100.00,1504,"+47 2212 1555",new Address("Drammensveien 126A","PB 211 Sentrum","Oslo",null,"N 0106","Norway  ")));
		customerList.add(new Customer(303, "Bradley Schuyler",0.00,null,"+31 20 491 9555",new Address("Kingsfordweg 151",null,"Amsterdam",null,"1043 GR","Netherlands")));
		customerList.add(new Customer(307, "Mel Andersen",0.00,null,"030-0074555",new Address("Obere Str. 57",null,"Berlin",null,"12209","Germany")));
		customerList.add(new Customer(311, "Pirkko Koskitalo",90500.00,1501,"981-443655",new Address("Torikatu 38",null,"Oulu",null,"90110","Finland")));
		customerList.add(new Customer(314, "Catherine  Dewey",79900.00,1401,"(02) 5554 67",new Address("Rue Joseph-Bens 532",null,"Bruxelles",null,"B-1180","Belgium")));
		customerList.add(new Customer(319, "Steve Frick",102700.00,1323,"9145554562",new Address("3758 North Pendale Street",null,"White Plains","NY","24067","USA")));
		customerList.add(new Customer(320, "Wing Huang",94500.00,1188,"5085559555",new Address("4575 Hillside Dr.",null,"New Bedford","MA","50553","USA")));
		customerList.add(new Customer(321, "Julie Brown",105000.00,1165,"6505551386",new Address("7734 Strong St.",null,"San Francisco","CA","94217","USA")));
		customerList.add(new Customer(323, "Mike Graham",88000.00,1612,"+64 9 312 5555",new Address("162-164 Grafton Road","Level 2","Auckland  ",null,null,"New Zealand")));
		customerList.add(new Customer(324, "Ann  Brown",77000.00,1501,"(171) 555-0297",new Address("35 King George",null,"London",null,"WX3 6FW","UK")));
		customerList.add(new Customer(328, "William Brown",43000.00,1323,"2015559350",new Address("7476 Moss Rd.",null,"Newark","NJ","94019","USA")));
		customerList.add(new Customer(333, "Ben Calaghan",51600.00,1611,"61-7-3844-6555",new Address("31 Duncan St. West End",null,"South Brisbane","Queensland","4101","Australia")));
		customerList.add(new Customer(334, "Kalle Suominen",98800.00,1501,"+358 9 8045 555",new Address("Software Engineering Center","SEC Oy","Espoo",null,"FIN-02271","Finland")));
		customerList.add(new Customer(335, "Philip  Cramer",0.00,null,"0555-09555",new Address("Maubelstr. 90",null,"Brandenburg",null,"14776","Germany")));
		customerList.add(new Customer(339, "Francisca Cervantes",81100.00,1188,"2155554695",new Address("782 First Street",null,"Philadelphia","PA","71270","USA")));
		customerList.add(new Customer(344, "Jesus Fernandez",59600.00,1702,"+34 913 728 555",new Address("Merchants House","27-30 Merchant's Quay","Madrid",null,"28023","Spain")));
		customerList.add(new Customer(347, "Brian Chandler",57700.00,1166,"2155554369",new Address("6047 Douglas Av.",null,"Los Angeles","CA","91003","USA")));
		customerList.add(new Customer(348, "Patricia  McKenna",0.00,null,"2967 555",new Address("8 Johnstown Road",null,"Cork","Co. Cork",null,"Ireland")));
		customerList.add(new Customer(350, "Laurence  Lebihan",65000.00,1337,"91.24.4555",new Address("12, rue des Bouchers",null,"Marseille",null,"13008","France")));
		customerList.add(new Customer(353, "Paul  Henriot",81100.00,1337,"26.47.1555",new Address("59 rue de l'Abbaye",null,"Reims",null,"51100","France")));
		customerList.add(new Customer(356, "Armand Kuger",0.00,null,"+27 21 550 3555",new Address("1250 Pretorius Street",null,"Hatfield","Pretoria","0028","South Africa")));
		customerList.add(new Customer(357, "Wales MacKinlay",77700.00,1612,"64-9-3763555",new Address("199 Great North Road",null,"Auckland",null,null,"New Zealand")));
		customerList.add(new Customer(361, "Karin Josephs",0.00,null,"0251-555259",new Address("Luisenstr. 48",null,"M�nster",null,"44087","Germany")));
		customerList.add(new Customer(362, "Juri Yoshido",41900.00,1216,"6175559555",new Address("8616 Spinnaker Dr.",null,"Boston","MA","51003","USA")));
		customerList.add(new Customer(363, "Dorothy Young",114200.00,1216,"6035558647",new Address("2304 Long Airport Avenue",null,"Nashua","NH","62005","USA")));
		customerList.add(new Customer(369, "Lino  Rodriguez",0.00,null,"(1) 354-2555",new Address("Jardim das rosas n. 32",null,"Lisboa",null,"1675","Portugal")));
		customerList.add(new Customer(376, "Braun Urs",0.00,1702,"0452-076555",new Address("Hauptstr. 29",null,"Bern",null,"3012","Switzerland")));
		customerList.add(new Customer(379, "Allen Nelson",70700.00,1188,"6175558555",new Address("7825 Douglas Av.",null,"Brickhaven","MA","58339","USA")));
		customerList.add(new Customer(381, "Pascale  Cartrain",23500.00,1401,"(071) 23 67 2555",new Address("Boulevard Tirou, 255",null,"Charleroi",null,"B-6000","Belgium")));
		customerList.add(new Customer(382, "Georg  Pipps",71700.00,1401,"6562-9555",new Address("Geislweg 14",null,"Salzburg",null,"5020","Austria")));
		customerList.add(new Customer(385, "Arnold Cruz",81500.00,1621,"+63 2 555 3587",new Address("15 McCallum Street","NatWest Center #13-03","Makati City",null,"1227 MM","Philippines")));
		customerList.add(new Customer(386, "Maurizio  Moroni",121400.00,1401,"0522-556555",new Address("Strada Provinciale 124",null,"Reggio Emilia",null,"42100","Italy")));
		customerList.add(new Customer(398, "Akiko Shimamura",94400.00,1621,"+81 3 3584 0555",new Address("2-2-8 Roppongi",null,"Minato-ku","Tokyo","106-0032","Japan")));
		customerList.add(new Customer(406, "Dominique Perrier",95000.00,1337,"(1) 47.55.6555",new Address("25, rue Lauriston",null,"Paris",null,"75016","France")));
		customerList.add(new Customer(409, "Rita  M�ller",0.00,null,"0711-555361",new Address("Adenauerallee 900",null,"Stuttgart",null,"70563","Germany")));
		customerList.add(new Customer(412, "Sarah McRoy",86800.00,1612,"04 499 9555",new Address("101 Lambton Quay","Level 11","Wellington",null,null,"New Zealand")));
		customerList.add(new Customer(415, "Michael Donnermeyer",77000.00,1504," +49 89 61 08 9555",new Address("Hansastr. 15",null,"Munich",null,"80686","Germany")));
		customerList.add(new Customer(424, "Maria Hernandez",67500.00,1286,"2125558493",new Address("5905 Pompton St.","Suite 750","NYC","NY","10022","USA")));
		customerList.add(new Customer(443, "Alexander  Feuer",0.00,null,"0342-555176",new Address("Heerstr. 22",null,"Leipzig",null,"04179","Germany")));
		customerList.add(new Customer(447, "Dan Lewis",49700.00,1323,"2035554407",new Address("2440 Pompton St.",null,"Glendale","CT","97561","USA")));
		customerList.add(new Customer(448, "Martha Larsson",116400.00,1504,"0695-34 6555",new Address("�kergatan 24",null,"Br�cke",null,"S-844 67","Sweden")));
		customerList.add(new Customer(450, "Sue Frick",77600.00,1165,"4085553659",new Address("3086 Ingle Ln.",null,"San Jose","CA","94217","USA")));
		customerList.add(new Customer(452, "Roland  Mendel",45300.00,1401,"7675-3555",new Address("Kirchgasse 6",null,"Graz",null,"8010","Austria")));
		customerList.add(new Customer(455, "Leslie Murphy",95400.00,1286,"2035559545",new Address("567 North Pendale Street",null,"New Haven","CT","97823","USA")));
		customerList.add(new Customer(456, "Yu Choi",39800.00,1286,"2125551957",new Address("5290 North Pendale Street","Suite 200","NYC","NY","10022","USA")));
		customerList.add(new Customer(458, "Mart�n  Sommer",104600.00,1702,"(91) 555 22 82",new Address("C/ Araquil, 67",null,"Madrid",null,"28023","Spain")));
		customerList.add(new Customer(459, "Sven  Ottlieb",0.00,null,"0241-039123",new Address("Walserweg 21",null,"Aachen",null,"52066","Germany")));
		customerList.add(new Customer(462, "Violeta Benitez",85800.00,1216,"5085552555",new Address("1785 First Street",null,"New Bedford","MA","50553","USA")));
		customerList.add(new Customer(465, "Carmen Anton",0.00,null,"+34 913 728555",new Address("c/ Gobelas, 19-1 Urb. La Florida",null,"Madrid",null,"28023","Spain")));
		customerList.add(new Customer(471, "Sean Clenahan",60300.00,1611,"61-9-3844-6555",new Address("7 Allen Street",null,"Glen Waverly","Victoria","3150","Australia")));
		customerList.add(new Customer(473, "Franco Ricotti",34800.00,1401,"+39 022515555",new Address("20093 Cologno Monzese","Alessandro Volta 16","Milan",null,null,"Italy")));
		customerList.add(new Customer(475, "Steve Thompson",55400.00,1166,"3105553722",new Address("3675 Furth Circle",null,"Burbank","CA","94019","USA")));
		customerList.add(new Customer(477, "Hanna  Moos",0.00,null,"0621-08555",new Address("Forsterstr. 57",null,"Mannheim",null,"68306","Germany")));
		customerList.add(new Customer(480, "Alexander  Semenov",0.00,null,"+7 812 293 0521",new Address("2 Pobedy Square",null,"Saint Petersburg",null,"196143","Russia")));
		customerList.add(new Customer(481, "Raanan Altagar,G M",0.00,null,"+ 972 9 959 8555",new Address("3 Hagalim Blv.",null,"Herzlia",null,"47625","Israel")));
		customerList.add(new Customer(484, "Jos� Pedro  Roel",65700.00,1702,"(95) 555 82 82",new Address("C/ Romero, 33",null,"Sevilla",null,"41101","Spain")));
		customerList.add(new Customer(486, "Rosa Salazar",72600.00,1323,"2155559857",new Address("11328 Douglas Av.",null,"Philadelphia","PA","71270","USA")));
		customerList.add(new Customer(487, "Sue Taylor",60300.00,1165,"4155554312",new Address("2793 Furth Circle",null,"Brisbane","CA","94217","USA")));
		customerList.add(new Customer(489, "Thomas  Smith",43300.00,1501,"(171) 555-7555",new Address("120 Hanover Sq.",null,"London",null,"WA1 1DP","UK")));
		customerList.add(new Customer(495, "Valarie Franco",85100.00,1188,"6175552555",new Address("6251 Ingle Ln.",null,"Boston","MA","51003","USA")));
		customerList.add(new Customer(496, "Tony Snowden",110000.00,1612,"+64 9 5555500",new Address("Arenales 1938 3'A'",null,"Auckland  ",null,null,"New Zealand")));
		return customerList;
	}
}

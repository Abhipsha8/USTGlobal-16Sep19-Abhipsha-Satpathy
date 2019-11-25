//objects using new keyword
var course = new Object();
course.name = 'Java';
course.fee = 30000;
course.timing ='2 hours';
console.log('course name=',course.name);
console.log('course fee=',course.fee)
console.log('course timing=',course.timing);
console.log('==================');

var student = new Object();
student.name ='Syed Sumiya';
student.IdNo = 14088;
student.age = 21;
console.log('student name=',student.name);
console.log('student ID=',student.IdNo);
console.log('student age=',student.age)
console.log('============');

var employee = new Object();
employee.name='Naveen';
employee.Id = 495;
employee.salary = 45000;
console.log('employee name=',employee.name);
console.log('employee id=',employee.Id);
console.log('employee salary=',employee.salary);
console.log('============');

var book = new Object();
book.name='English';
book.cost= 400;
console.log('book name=',book.name);
console.log('book cost=',book.cost);
console.log('============');

var pen = new Object();
pen.name='exclasBright';
pen.cost= 10;
pen.colour='blue';
console.log('pen name=',pen.name);
console.log('pen cost=',pen.cost);
console.log('pen colour=',pen.colour);
console.log('***************')
//objects without using new keyword
var company1={
    name:'UST Global',
    headquater:'California',
    CEO:'Sajan Pillai',
    }
    var Cname=company1.name
    console.log('company name=',Cname);
    var headquater=company1.headquater
    console.log('headquator of UST Global=',headquater);
    var ceo=company1.CEO
    console.log("CEO of UST Global=",ceo);
    console.log("===============");
    
    var company2={
        name:'wipro',
        headquater:'Bengalore',
        CEO:'Abidali Neemuchwala',
    }
    var Cname=company2.name
    console.log('Company name=',Cname);
    var headquater=company2.headquater
    console.log('headquater of wipro=',headquater);
    var ceo=company2.CEO
    console.log('ceo of wipro=',ceo);
    console.log('==========');

    var company3={
        name:'TCS',
        headquater:'Mumbai',
        CEO:'Rajesh Gopinathan',
    }
    var Cname=company3.name
    console.log('company name=',Cname);
    var headquater=company3.headquater
    console.log('headquater of TCS=',headquater);
    var ceo=company3.CEO;
    console.log('ceo of tcs=',ceo);
    console.log('=============');

    var company4={
        name:'Accenture',
        headquater:'IreLand',
        CEO:'Julie Sweet',
    }
    var Cname=company4.name
    console.log('company name=',Cname);
    var headquater=company4.headquater
    console.log('headquater of Accenture=',headquater);
    var ceo=company4.CEO
    console.log('ceo of accentute=',ceo);
    console.log('===========');

    var company5={
        name:'Capgemini',
        headquater:'Paris',
        CEO:'Paul Hermelin',
    }
    var Cname=company5.name
    console.log('company nname=',Cname);
    var headquater=company5.headquater
    console.log('headquater of Capgemini=',headquater);
    var ceo=company5.CEO
    console.log('ceo of Capgemini=',ceo);
    console.log('************');

    //Arrays using new keyword
    var CompanyNames = new Array('UST Global','Capgemini','Wipro','HCL');
    console.log('company names=',CompanyNames);
    console.log('name of the company=',CompanyNames[2]);
    console.log('company length=',CompanyNames.length);


    //Arrays without using new keyword
    var cars=['Aadi','Benze','Toyota','suzuki']
    console.log('car=',cars);
    console.log('car name=',cars[2]);
    console.log('car length=',cars.length);

    var fruit=['apple','mango'];
    console.log('fruits=',fruit);
    console.log('length=',fruit.length);

    var heros=['salman','hritik','amir'];
    console.log('heros=',heros);
    console.log('length=',heros.length);

    var mobiles=['redmi','samsung','lenovo','honor'];
    console.log('mobiles=',mobiles);
    console.log('length=',mobiles.length);

    var family=['father','mother','brother','sister'];
    console.log('family=',family);
    console.log('length=',family.length);



    //Array using loop
    var colors=['Blue','Black','Green','Yellow','Red']
    for(var i=0;i<colors.length;i++)
    {
        console.log(colors[i]);
    }

 

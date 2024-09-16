# OOPS_lec2

<h2>Pakages in Java 📁</h2>
<p>Packages are nothing but folders in which java files are present</p>
<p>Packages in java help us to organise the java programs in very efficient way</p>
<p>Packages comprises with different Classes or Interfaces and the Classes/Interfaces inside packages are unique</p>
<p>Means if one package contains the class named as "Hello" then we cannot create a same class inside that particular package</p>
<p>Most important and useful application of the packages are they provide functionality which help us to use one class object in any other class by simply importing it in the present class</p>

![alt text](image-47.png)

![alt text](image-48.png)

![alt text](image-49.png)

<h2>Output 😁</h2>

![alt text](image-50.png)


<h3>Here in above example how we can efficiently access Greet class from PkgB inside Hello Class present inside PkgA this feature are provided by packages </h3>

<h3>You also Noticed that we mention package name/location on the top of every program it is only for compiler to locate the position of the particular class</h3>

<h3>If two classes are in same package then there is no need to use "import" statement instead we can directly use them</h3>

<h3> Types of Packages in Java 🤔</h3>

![alt text](image-51.png)

<h2>What is "static" keyword 🤔</h2>
<p>"Static" keyword is use to declare some variable/properties & functions of the particular class as static</p>
<p>Static variables/Methods are the independent variables and methods means they are not depend upon the object for all object there values/functionality is same </p>

<h2>What is the need of "static" Variables/Methods in classes</h2>
<p>There is a simple example which explains this very clearly :</p>
<p>Let's Create a class name Human with some properties like age,name,salary,married & gender etc</p>

![alt text](image-52.png)

<p>Now lets create a Main class to create a objects of the Human class in the same package</p>

![alt text](image-53.png)

<p>Here we create 2 objects one is h1 and another is h2 after that we notice that the all properties inside the Human class which we created are related to particular objects means in short all objects have unique values for this properties</p>

<p>But we know there are some properties or functions which are common for all Human class irrespective of Object</p>

<p>The Properties like Population of world , Planet they are living etc. And they also have some common functions like Walking,Inhaling,Jumping,Eating etc which are common in all Human class objects and there values are also same for all</p>

<h3>So to create those properties or methods which do not change as per instance of the class changes we require "static" keyword</h3>

![alt text](image-55.png)

<p>Here we add population property inside the Human class which is static which value remains constant for all objects of human class</p>

![alt text](image-56.png)

![alt text](image-57.png)

<p>As we can see the value of population is set same for all objects</p>

<h3>Lets see how to access & modify the "static" variables 👀 </h3>
<p>Static variable is access by the object name as well as Class name but the convertion is to <mark> Access Static Variable Using Class Name </mark></p>

![alt text](image-58.png)
![alt text](image-59.png)

<p>Also while Modifying the static variable in using Constructor we should use the <mark> Class Name</mark> only.</p>

<p>Here "this" keyword is also works to modify the static variables but here also the convention is to use Class Name</p>

![alt text](image-60.png)

<p>When we use "this" keyword it showing us a warning.But it modify the static property</p>

![alt text](image-61.png)
![alt text](image-62.png)

<p>But we use "Class Name" to modify the static variable</p>

![alt text](image-64.png)
<p>Now we can see the when we use "Class name" instead of "this" key word compiler stop showing warning</p>
<p>And it also working properly 😃</p>

<h3>So always use Class Name to access and modify the static variables as per convention</h3>

<h2>Now one question should arise in our mind that how "this" keyword modify the static variable value errorlessly 🤔</h2>

![alt text](image-65.png)

<p>We already know when we use "this" keyword in constructor to modify the properties values the this keyword first point to the reference variable of the particular object which is initialised</p>

<p>Similarly here also it points to the object "h1" but in object "h1" it unable to find the population property and we know that from the previous lecture when "this" keyword not get any reference of a particular property in pointed object then it checkout for the same property in the Class</p>

<p>Similarly if it not get population property in "h1" object then it checks that property in "Human" class and it found population property in that class so it update or modify it by adding 1 in it, At this time "this" pointing to the "Human" class</p>

<p>So modifying the static variable using "this" keyword is like </p>

![alt text](image-66.png)


<h3>😃 Fun Fact is that Static variables as well as functions are do not require any object to access them we can directly access them using class name only</h3>

<h3>"Static" keyword help to perform Procedural Programming in java we can literally use them without creating objects for a that particular class</h3>

![alt text](image-67.png)

<h2>Why we declare the "main" method as static method 🤔</h2>

![alt text](image-68.png)

<p>We declare "main" method as static because we know that the "main" method is the most important method without main method we cannot even run our program</p>

<p>If the main method is not static then to run or access it we always need to create an object or instance for a particular class and then we can run it</p>

<p>So to run it without creating any sort of object we declare main method as "static" so programmer can run the program without creating a object for it.</p>

<h3>⭐ Static methods / Properties are belong to Class not to Object of that class</h3>

<h3>We cannot access or call non static variables or methods inside the static methods 🤯
</h3>

![alt text](image-71.png)

<p>If we do it static then we access it inside static method</p>

![alt text](image-72.png)

<h3>Why this is so 🤔</h3>
<p>As we know the any static method shows that I am independent of objects but all non static methods or variables are dependent on objects they require the instance of the class to access them but a static method doesn't require any such instance</p>

<p>So when a non static method is called inside the static method non static method demands a instance to call itself but static method do not have such instance so due to this reason we cannot call non static method inside the static method but vise versa is possible</p> 

<h3>We can access non static methods or variable inside the non static methods because to call the non static method we need to create an instance and when inside non static we call another non static then it also demand for instance then the reference of the previous one is pass to this non static method or variable</h3>

![alt text](image-73.png)
![alt text](image-74.png)

<h3>Here we can see the obj1 reference which is first pass to fun() and then pass to greet() to run it</h3>

![alt text](image-75.png)

<h3>In static function inside class we cannot access non static variable even if we are using "this" keyword</h3>

![alt text](image-76.png)

<h2>What is Static Block & how static variables behaves 🤔</h2>
<p>We create a static block in which we can write code which is static in nature means it do not require any object or instance to run</p>

<h3>The fun 😃 fact is that all the code inside static block only runs once when the class is loaded for the first time.</h3>

![alt text](image-77.png)

<h3>Output 🤯</h3>

![alt text](image-78.png)

<p>In by observing code and output we can easily get that the code inside the static block runs only ones when the first object of the class is created</p>

<h3>So the best application of the static block is to initialise some important parameters of class or to display some message or alert.When class is loaded first etc</h3>

<h2>What is Inner Class 🤔</h2>
<p>Inner class is nothing but a class inside the other class.</p>
<p>If your inner class is not static then to create the object of the inner class you required the object of the outer class</p>
<p>But if you declare the inner class as the static then your inner class is independent of the outer class object</p>
<p>So you can directly create new object of that class without creating object of the outer class</p>

<h3>Here we can see the inner class named as "TestClass" is not static so we cannot create object of that class inside the main function.</h3>

![alt text](image-79.png)

<h3>Now we convert TestClass to static so we can create object inside the main function</h3>

<h3>Here we know that the class is nothing but a builtin datatype created by us so it work as it's original property means it can create objects still it is static.</h3>
<h3>Static is in the sense that the TestClass do not require Object of the InnerClass to create it's own object here it is just like other classes not like a Inner class </h3>

![alt text](image-80.png)
![alt text](image-81.png)

<h3>🌟 All static methods / variables are not related to object so they resolved at compile time only</h3>

<h2>toString() method 🤔</h2>

![alt text](image-82.png)

<h3>Output 😃</h3>

![alt text](image-83.png)

<h3>Here we can see the if we print the object using println function the println function toString() method inside the object if it not finds the toString() method inside the object then it prints the hash value of that particular object</h3>

<h3>But if we declare the toString() method inside the Class then the println call that method and print the content inside it</h3>

![alt text](image-84.png)

![alt text](image-85.png)

<h3>Output 😃</h2>

![alt text](image-86.png)

<p>Here we can created toString() method inside the class so when we println the object t1 it return the name property of that object which is "omkar"</p>


<h2>What is Singleton Class 🤔</h2>
<p>Singleton class is the class which only allow to create one instance only means class which can have only one Object</p>

![alt text](image-87.png)

<p>Here we make the constructor private so anybody outside the class do access the constructor it indirectly means that anybody outside the class cannot create the object of the class</p>

<p>Here we create a static instance which is also private and also create the modified constructor like function which takes track that object is created once or not if the object is created once it return that same object</p>

<p>If the object is null then it initialise that object using private constructor inside the class only</p>

<p>In main function if we create multiple object but all reference variable of the created object pointing towards the single object which is created first</p>

<h3>So this types of Classes are known as Singleton class</h3>

![alt text](image-88.png)











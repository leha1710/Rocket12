import java.util.Date;

public class Program {

	public static void main(String[] args) {
		// logic
		// create Department
		Department department1 = new Department();
		department1.id = 1;
		department1.name = "Sale";

		Department department2 = new Department();
		department2.id = 2;
		department2.name = "Marketing";

		Department department3 = new Department();
		department3.id = 3;
		department3.name = "HR";
		
        // create Position
		Position position1 = new Position();
		position1.id = 1;
		position1.name = PositionName.DEV;
		
		Position position2 = new Position();
		position2.id = 2;
		position2.name = PositionName.PM;
		
		Position position3 = new Position();
		position3.id = 3;
		position1.name = PositionName.SCRUM_MASTER;
		// create Account
		Account account1 = new Account();
		account1.id = 1;
		account1.email = "nguyenvanA@gmail.com";
		account1.fullName = "NguyenVanA";
		account1.userName = "abc";
		account1.department = department1;
		account1.position = position1;
		account1.createDate = new Date ("2020/09/27");
		
		Account account2 = new Account();
		account2.id = 2;
		account2.email = "nguyenvanb@gmail.com";
		account2.fullName = "NguyenVanB";
		account2.userName = "abcd";
		account2.department = department2;
		account2.position = position2;
		account2.createDate = new Date ("2020/07/29");
		
		Account account3 = new Account();
		account3.id = 3;
		account3.email = "nguyenvanA@gmail.com";
		account3.fullName = "NguyenVanC";
		account3.userName = "bcc";
		account3.department = department1;
		account3.position = position3;
		account3.createDate = new Date ("2020/09/29");
		// create Group
		Group group1 = new Group();
		group1.id = 1;
		group1.name = "JavaFesher";
		group1.creator = account1;
		group1.createDate = new Date ("2020/03/29");
		
		Group group2 = new Group();
		group2.id = 2;
		group2.name = "C#Fesher";
		group2.creator = account2;
		group2.createDate = new Date ("2020/03/25");
		
		Group group3 = new Group();
		group3.id = 3;
		group3.name = "PythonFesher";
		group3.creator = account3;
		group3.createDate = new Date ("2020/03/24");
		
		Group[] groupsOfAccount1 = {group1, group2};
		account1.groups = groupsOfAccount1;
		
		Group[] groupsOfAccount2 = {group2, group3};
		account2.groups = groupsOfAccount2;
		
		Group[] groupsOfAccount3 = {group1, group3};
		account3.groups = groupsOfAccount3;
		
		Account[] accountsOfGroup1 = {account1, account3};
		group1.accounts = accountsOfGroup1;
		
		Account[] accountsOfGroup2 = {account1, account2};
		group2.accounts = accountsOfGroup2;
		
		Account[] accountsOfGroup3 = {account2, account3};
		group3.accounts = accountsOfGroup3;
		
		// create type question
		TypeQuestion typequestion1 = new TypeQuestion();
		typequestion1.id = 1;
		typequestion1.name = TypeName.ESSAY;
		
		TypeQuestion typequestion2 = new TypeQuestion();
		typequestion2.id = 2;
		typequestion2.name = TypeName.MULTIPLE_CHOICE;
		
		TypeQuestion typequestion3 = new TypeQuestion();
		typequestion3.id = 3;
		typequestion3.name = TypeName.MULTIPLE_CHOICE;
		
		// create category question
		CategoryQuestion categoryquestion1 = new CategoryQuestion();
		categoryquestion1.id = 1;
		categoryquestion1.name = "Java";
		
		CategoryQuestion categoryquestion2 = new CategoryQuestion();
		categoryquestion2.id = 2;
		categoryquestion2.name = "SQL";
		
		CategoryQuestion categoryquestion3 = new CategoryQuestion();
		categoryquestion3.id = 3;
		categoryquestion3.name = "Ruby";
		
		// create question
		Question question1 = new Question();
		question1.id = 1;
		question1.content ="hom nay la thu may";
		question1.category = categoryquestion1;
		question1.type = typequestion1;
		question1.creator = account1;
		question1.createDate = new Date ("2020/08/25");
		
		Question question2 = new Question();
		question2.id = 2;
		question2.content ="hom nay la thu tu";
		question2.category = categoryquestion2;
		question2.type = typequestion2;
		question2.creator = account2;
		question2.createDate = new Date ("2020/07/25");
		
		Question question3 = new Question();
		question3.id = 3;
		question3.content ="hom nay la thu hai";
		question3.category = categoryquestion3;
		question3.type = typequestion3;
		question3.creator = account3;
		question3.createDate = new Date ("2020/06/25");
		
		// create answer
		Answer answer1 = new Answer();
		answer1.id = 1;
		answer1.content = "cau tra loi sai";
		answer1.isCorrect = false;
		
		Answer answer2 = new Answer();
		answer2.id = 2;
		answer2.content = "cau tra loi dung";
		answer2.isCorrect = true;
		
		Answer answer3 = new Answer();
		answer3.id = 3;
		answer3.content = "cau tra loi lac de";
		answer3.isCorrect = false;
		
		// Exam
		Exam exam1 = new Exam();
		exam1.id = 1;
		exam1.code = "A1";
		exam1.title = "Test1";
		exam1.category = categoryquestion1;
		exam1.duration = 120;
		exam1.creator = account1;
		exam1.createDate = new Date ("2020/01/25");
		
		Exam exam2 = new Exam();
		exam2.id = 2;
		exam2.code = "B1";
		exam2.title = "Test2";
		exam2.category = categoryquestion1;
		exam2.duration = 150;
		exam2.creator = account2;
		exam2.createDate = new Date ("2020/04/24");
		
		Exam exam3 = new Exam();
		exam3.id = 3;
		exam3.code = "A1";
		exam3.title = "Test1";
		exam3.category = categoryquestion1;
		exam3.duration = 120;
		exam3.creator = account3;
		exam3.createDate = new Date ("2020/01/25");
		
		Exam[] examsOfQuestion1 = {exam1, exam2};
		question1.exams = examsOfQuestion1;
		
		Exam[] examsOfQuestion2 = {exam2, exam3};
		question2.exams = examsOfQuestion2;
		
		Exam[] examsOfQuestion3 = {exam1, exam3};
		question3.exams = examsOfQuestion3;
		
		Question[] questionsOfExam1 = {question1, question3};
		exam1.questions = questionsOfExam1;
		
		Question[] questionsOfExam2 = {question1, question2};
		exam2.questions = questionsOfExam2;
		
		Question[] questionsOfExam3 = {question2, question3};
		exam3.questions = questionsOfExam3;
		
		System.out.println("---------Departments---------");
		System.out.println("Information of department 1:");
		System.out.println("ID: " + department1.id);
		System.out.println("Name: " + department1.name);
		System.out.println("\n");
		
		System.out.println("Information of department 2:");
		System.out.println("ID: " + department2.id);
		System.out.println("Name: " + department2.name);
		System.out.println("\n");
		
		System.out.println("Information of department 3:");
		System.out.println("ID: " + department3.id);
		System.out.println("Name: " + department3.name);
		System.out.println("\n");
		
		
		System.out.println("---------Positions---------");
		System.out.println("Information of position 1:");
		System.out.println("ID: " + position1.id);
		System.out.println("Name: " + position1.name);
		System.out.println("\n");
		
		System.out.println("Information of position 2:");
		System.out.println("ID: " + position2.id);
		System.out.println("Name: " + position2.name);
		System.out.println("\n");
		
		System.out.println("Information of position 3:");
		System.out.println("ID: " + position3.id);
		System.out.println("Name: " + position3.name);
		System.out.println("\n");
		
		
		System.out.println("---------Accounts---------");
		System.out.println("Information of account 1:");
		System.out.println("ID: " + account1.id);
		System.out.println("Email: " + account1.email);
		System.out.println("User Name: " + account1.userName);
		System.out.println("Full Name: " + account1.fullName);
		System.out.println("Department Name: " + account1.department.name);
		System.out.println("Position Name: " + account1.position.name);
		System.out.println("Create Date: " + account1.createDate);
		System.out.println("\n");
		
		System.out.println("Information of account 2:");
		System.out.println("ID: " + account2.id);
		System.out.println("Email: " + account2.email);
		System.out.println("User Name: " + account2.userName);
		System.out.println("Full Name: " + account2.fullName);
		System.out.println("Department Name: " + account2.department.name);
		System.out.println("Position Name: " + account2.position.name);
		System.out.println("Create Date: " + account2.createDate);
		System.out.println("\n");
		
		System.out.println("Information of account 3:");
		System.out.println("ID: " + account3.id);
		System.out.println("Email: " + account3.email);
		System.out.println("User Name: " + account3.userName);
		System.out.println("Full Name: " + account3.fullName);
		System.out.println("Department Name: " + account3.department.name);
		System.out.println("Position Name: " + account3.position.name);
		System.out.println("Create Date: " + account3.createDate);
		System.out.println("\n");
		
		System.out.println("---------Groups---------");
		System.out.println("Information of group 1:");
		System.out.println("ID: " + group1.id);
		System.out.println("Name: " + group1.name);
		System.out.println("Creator: " + group1.creator.fullName);
		System.out.println("Create Date: " + group1.createDate);
		System.out.println("\n");
		
		System.out.println("Information of group 2:");
		System.out.println("ID: " + group2.id);
		System.out.println("Name: " + group2.name);
		System.out.println("Creator: " + group2.creator.fullName);
		System.out.println("Create Date: " + group2.createDate);
		System.out.println("\n");
		
		System.out.println("Information of group 3:");
		System.out.println("ID: " + group3.id);
		System.out.println("Name: " + group3.name);
		System.out.println("Creator: " + group3.creator.fullName);
		System.out.println("Create Date: " + group3.createDate);
		System.out.println("\n");
		
		System.out.println("---------Types---------");
		System.out.println("Information of type question 1:");
		System.out.println("ID: " + typequestion1.id);
		System.out.println("Name: " + typequestion1.name);
		System.out.println("\n");
		
		System.out.println("Information of type question 2:");
		System.out.println("ID: " + typequestion2.id);
		System.out.println("Name: " + typequestion2.name);
		System.out.println("\n");
		
		System.out.println("---------Categories---------");
		System.out.println("Information of category 1:");
		System.out.println("ID: " + categoryquestion1.id);
		System.out.println("Name: " + categoryquestion1.name);
		System.out.println("\n");
		
		System.out.println("Information of category 2:");
		System.out.println("ID: " + categoryquestion2.id);
		System.out.println("Name: " + categoryquestion2.name);
		System.out.println("\n");
		
		System.out.println("Information of category 3:");
		System.out.println("ID: " + categoryquestion3.id);
		System.out.println("Name: " + categoryquestion3.name);
		System.out.println("\n");
		
		System.out.println("---------Questions---------");
		System.out.println("Information of question 1:");
		System.out.println("ID: " + question1.id);
		System.out.println("Content: " + question1.content);
		System.out.println("Category Name: " + question1.category.name);
		System.out.println("Type Name: " + question1.type.name);
		System.out.println("Creator: " + question1.creator.fullName);
		System.out.println("Create Date: " + question1.createDate);
		System.out.println("\n");
		
		System.out.println("Information of question 2:");
		System.out.println("ID: " + question2.id);
		System.out.println("Content: " + question2.content);
		System.out.println("Category Name: " + question2.category.name);
		System.out.println("Type Name: " + question2.type.name);
		System.out.println("Creator: " + question2.creator.fullName);
		System.out.println("Create Date: " + question2.createDate);
		System.out.println("\n");
		
		System.out.println("Information of question 3:");
		System.out.println("ID: " + question3.id);
		System.out.println("Content: " + question3.content);
		System.out.println("Category Name: " + question3.category.name);
		System.out.println("Type Name: " + question3.type.name);
		System.out.println("Creator: " + question3.creator.fullName);
		System.out.println("Create Date: " + question3.createDate);
		System.out.println("\n");
		
		System.out.println("---------Answers---------");
		System.out.println("Information of answer 1:");
		System.out.println("ID: " + answer1.id);
		System.out.println("Content: " + answer1.content);
		System.out.println("Question: " + answer1.question.content);
		System.out.println("Is Correct: " + answer1.isCorrect);
		System.out.println("\n");
		
		System.out.println("Information of answer 2:");
		System.out.println("ID: " + answer2.id);
		System.out.println("Content: " + answer2.content);
		System.out.println("Question: " + answer2.question.content);
		System.out.println("Is Correct: " + answer2.isCorrect);
		System.out.println("\n");
		
		System.out.println("Information of answer 3:");
		System.out.println("ID: " + answer3.id);
		System.out.println("Content: " + answer3.content);
		System.out.println("Question: " + answer3.question.content);
		System.out.println("Is Correct: " + answer3.isCorrect);
		System.out.println("\n");
		
		System.out.println("---------Exams---------");
		System.out.println("Information of exam 1:");
		System.out.println("ID: " + exam1.id);
		System.out.println("Code: " + exam1.code);
		System.out.println("Title: " + exam1.title);
		System.out.println("Category Name: " + exam1.category.name);
		System.out.println("Duration: " + exam1.duration);
		System.out.println("Creator: " + exam1.creator.fullName);
		System.out.println("Create Date: " + exam1.createDate);
		System.out.println("\n");
		
		System.out.println("Information of exam 2:");
		System.out.println("ID: " + exam2.id);
		System.out.println("Code: " + exam2.code);
		System.out.println("Title: " + exam2.title);
		System.out.println("Category Name: " + exam2.category.name);
		System.out.println("Duration: " + exam2.duration);
		System.out.println("Creator: " + exam2.creator.fullName);
		System.out.println("Create Date: " + exam2.createDate);
		System.out.println("\n");
		
		System.out.println("Information of exam 3:");
		System.out.println("ID: " + exam3.id);
		System.out.println("Code: " + exam3.code);
		System.out.println("Title: " + exam3.title);
		System.out.println("Category Name: " + exam3.category.name);
		System.out.println("Duration: " + exam3.duration);
		System.out.println("Creator: " + exam3.creator.fullName);
		System.out.println("Create Date: " + exam3.createDate);
		System.out.println("\n");	
	}

	}



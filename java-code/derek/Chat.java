//https://courses.campus.gov.il/courses/course-v1:HUJI+ACD_RFP4_HUJI_OOP+2019_1/courseware/88ab077de1994b86bdb52ce07412c07c/663dc3725c004e47b142d037882795fe/?child=first
// שכון ממשלתי-סוכנות  18/11/2021 10:00
//אנו מצפים להגעתך לסניף. בהגיעך לסניף יש להקליד את מספר הטלפון בעמדת התורים. התור יישמר לך בטווח של 10 דקות מהשעה שנקבעה.

import java.util.Scanner;

class Chat {
 public static void main(String[] args) {
    String[] illegalReplies1 = { "say I should say ", "what " };
    String[] illegalReplies2 = { "say say ", "whaaat " };
	String statement = "say book";
    ChatterBot[] bots = new ChatterBot[2];
    bots[0] = new ChatterBot("Sammy", illegalReplies1);
    bots[1] = new ChatterBot("Ruthy", illegalReplies2);
 
    Scanner scanner = new Scanner(System.in);
	
	int NumOfBots =  bots.length;
	System.out.println("Number of bots: " +NumOfBots);
	int botIndex;
	String botName;
	for(int i = 0 ; ; i++) {
			botIndex = i % bots.length ;
			botName = bots[botIndex].getName();
			statement = bots[botIndex].replyTo(statement);
			 
			System.out.println("[ "+i+" : "+botName+ " ] "  +statement);
			scanner.nextLine();
    } 
	 
 }//main
  
}//class Chat



/*

לסיכום!

נסכם את שלבי הפיתוח של תכנית מונחית עצמים קטנה, ואלו הם:
1. אנקפסולציה.

לחלק את התכנית למחלקות, כך שכל מחלקה אחראית על נושא אחד מוגדר היטב.
2. קביעת ה-API.

אמרנו ש-API הוא הממשק התכנותי של המחלקה - application programming interface. כאן אנחנו מבטאים את התפקיד של המחלקה בבחירת האיברים פומביים שלה. דיברנו גם על שני עקרונות שעוזרים לנו בשלב קביעת ה-API:
2.1 minimal API - לא להכביד על הממשק. להעדיף רשימת שיטות פשוטה להבנה ופיענוח.
2.2 אבסטרקציה: קודם לחשוב איך היינו רוצים שהמחלקה תיראה מבחוץ. איך ניתן שירות נח. השירות עשוי להיות (וכנראה גם כדאי שיהיה) שונה מאוד מאיך שחשבנו לממש את הפונקציונליות בפועל.

3. מימוש.
כאן אנחנו מממשים את ה-API שהחלטנו עליו. בשלב הזה אנחנו יכולים להוסיף קבועים, או שדות, או שיטות - לפי הצורך. בתנאי --- שהאיברים הללו פרטיים - הם לא חלק מהממשק. לזה קראנו הסתרת מידע, וזהו חלק מהותי בשימור החלוקה שהגדרנו בשלב הראשון.

בהמשך הקורס, נתחיל לדון בבניית תוכנות גדולות יותר. שם נראה איך אותם עקרונות ארכיטקטוניים ישרתו אותנו גם כשנבנה מבנים גדולים יותר.




את כל המושגים שאתם זוכרים מהפרק:
אנקפסולציה / Encapsulation
מגדירי נראות / Visibility Modifiers
Application Programming Interface
עיקרון הממשק התכנותי המינימלי / Minimal API
עיקרון האבסטרקציה / Abstraction

*/
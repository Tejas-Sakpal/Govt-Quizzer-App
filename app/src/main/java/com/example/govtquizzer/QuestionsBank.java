package com.example.govtquizzer;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {

    private  static List<QuestionsList> gkQuestions(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        //Create a object of question list and pass equations along with options & answers
        final QuestionsList question1 = new QuestionsList("Where is National Human Museum situated?","Guwahati","Bastar","Bhopal","Chennai","Bhopal","");
        final QuestionsList question2 = new QuestionsList("The first war of Independence 1857 started from?","Lucknow","Jhansi","Meerut","Kanpur","Meerut","");
        final QuestionsList question3 = new QuestionsList("Where is the Taklamakan desert situated?","China", "South Africa","North Africa","Austrelia","China","");
        final QuestionsList question4 = new QuestionsList("Which of the following is brightest star in the sky?","North Star","Canopus","Sirius","Pollux","Sirius","");
        final QuestionsList question5 = new QuestionsList("Chloroquine is used to treat which disease?","Malaria","Cancer","Dengue","Chorona Fever","Malaria","");
        final QuestionsList question6 = new QuestionsList("Who founded the Newspaper 'Al-Hilal'?","Dadabhai Naoroji","Moulana Abul kalam Azad","Mohd. Iqbal","Mohd. Jinnha","Moulana Abul kalam Azad","");
        final QuestionsList question7 = new QuestionsList("Who founded the Pala Kingdom in East India?","Gopala","Krishna","Vikramditya","Mihira Bhoja","Gopala","");
        final QuestionsList question8 = new QuestionsList("Who build the Konark Sun Temple?","Narasimhadeva 1","Kapilendra Deva","Purushottam Deva","Anantavarman Chodaganga Deva","Narasimhadeva 1","");
        final QuestionsList question9 = new QuestionsList("The Agra fort was built by _____ ","Shah Jahan","Akbar","Jahangir","Babar","Akbar","");
        final QuestionsList question10 = new QuestionsList("The tax collected by Marathas was known as ","Chauth","Pilgrim Tax","Jazia","Charai","Chauth","");


        // add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);




        return questionsLists;

    }

    private  static List<QuestionsList> reasoningQuestions(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        //Create a object of question list and pass equations along with options & answers
        final QuestionsList question1 = new QuestionsList("Find the missing term in the given series: U32,V29, ? ,X23,Y20","V17","Z17","W26","Z26","W26","");
        final QuestionsList question2 = new QuestionsList("Complete the following Series: 9,196,25,169,49,144,81,___","121","100","64","34","121","");
        final QuestionsList question3 = new QuestionsList("Information:Encyclopedia :: Equipment:?","Constitution","Factory","Economy","Country","Factory","");
        final QuestionsList question4 = new QuestionsList("Choose the different word :","Scruffy","Dapper","Dashing","Elegant","Scruffy","");
        final QuestionsList question5 = new QuestionsList("Meenu introduces Manish as the only son of his father's father. How Meenu related to Manish?","Mother","Sister","Daughter","Brother","Daughter","");
        final QuestionsList question6 = new QuestionsList("'Zoology' is related to animals in the same way 'Crainology' is related to ____","Fishes","Shells","Algae","Skull","Skull","");
        final QuestionsList question7 = new QuestionsList("JMKP:QNPK :: HTQR:?","SHKO","SGJI","TGJI","THKI","SGJI","");
        final QuestionsList question8 = new QuestionsList("Select the Odd Word Pair","Eagle:Bird","Crocodile:Reptile","Spider:Amphibian","Frog:Amphibian","Spider:Amphibian","");
        final QuestionsList question9 = new QuestionsList("Interchanged to make correct equation 4+2/3*8-1=6","3 and 4","2 and 4","8 and 4","3 and 8","3 and 4","");
        final QuestionsList question10 = new QuestionsList("Complete the series : 10,15,26,35,?","49","48","50","47","50","");

        // add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);


        return questionsLists;

    }

    private static List<QuestionsList> englishQuestions(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        //Create a object of question list and pass equations along with options & answers
        final QuestionsList question1 = new QuestionsList("State the Meaning: To regard with disgust and hatred","tease","abhor","ridicule","sneer","abhor","");
        final QuestionsList question2 = new QuestionsList("Synonyms:INTELLECT","Scholar","Imbecility","Insanity","reverie","Scholar","");
        final QuestionsList question3 = new QuestionsList("Direct/Indirect Speech : He said,'I have done my job.'","He said that he has done his job","He said that he have done his job","He said that he had done his job","He said that he had been done his job","He said that he had done his job","");
        final QuestionsList question4 = new QuestionsList("Synonyms: MIRTH","Reluctant","Indecent","Reputation","Meriment","Meriment","");
        final QuestionsList question5 = new QuestionsList("Antonyms: IMPERTINENT","Insolent","Impudent","Cheeky","Courteous","Courteous","");
        final QuestionsList question6 = new QuestionsList("OWS: A writing or a speech in praise of someone","Etymology","Eulogy","Bibilophile","Honararium","Eulogy","");


        // add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    private static List<QuestionsList> mathsQuestions(){
        final List<QuestionsList> questionsLists = new ArrayList<>();

        //Create a object of question list and pass equations along with options & answers
        final QuestionsList question1 = new QuestionsList("56% of 4356 = 76% of 564 + ?","1789","2100","2500","2011","2011","");
        final QuestionsList question2 = new QuestionsList("(4/9)of(3/7)of(11/5)of 1211=?","610","456","508","580","508","");

        // add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);

        return questionsLists;
    }
    public static List<QuestionsList> getQuestions(String selectedTopicName){
        switch (selectedTopicName){
            case "gk":
                return gkQuestions();
            case "reasoning":
                return reasoningQuestions();
            case "english":
                return englishQuestions();
            default:
                return mathsQuestions();
        }
    }
}

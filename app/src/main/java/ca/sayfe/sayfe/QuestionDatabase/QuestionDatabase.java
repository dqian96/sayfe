package ca.sayfe.sayfe.QuestionDatabase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing content for user interfaces (helper classes lump together a sequence of operations into one
 * class to make them reusable
 */
public class QuestionDatabase {

    //A list of Questions objects
    public static final List<Questions> QUESTIONS = new ArrayList<Questions>();

    //A map of Questions, by ID
    public static final Map<String, Questions> QUESTIONS_MAP = new HashMap<String, Questions>();

    //QUESTIONS
    static {
        int counter = 0;

        addQuestion(createQuestionItem(
                ++counter,
                "What is Sayfe?",
                "At Sayfe, we aspire to educate, support and empower students to combat issues surrounding sexual assault. " +
                        "We educate students on the importance of consent, the availability of resources and on the " +
                        "seriousness of sexual assault and harassment. We support survivors of sexual assault by" +
                        " providing support forums and by creating a community to start a conversation. " +
                        "We provide reviews of available resources to empower students and" +
                        " return the power of choice to them.\n"
        ));

        addQuestion(createQuestionItem(
                ++counter,
                "Facts and Statistics",
                "Of every 100 incidents of sexual assault, only 6 are reported to the police\n"+
                        "\u00B7 1 - 2% of \"date rape\" sexual assaults are reported to the police\n"+
                        "· 1 in 4 North American women will be sexually assaulted during their lifetime\n"+
                        "· 11% of women have physical injury resulting for sexual assault\n"+
                        "· Only 2 - 4% of all sexual assaults reported are false reports\n"+
                        "· 60% of sexual abuse/assault victims are under the age of 17\n"+
                        "· over 80% of sex crime victims are women\n"+
                        "· 80% of sexual assault incidents occur in the home\n"+
                        "· 17% of girls under 16 have experienced some form of incest\n"+
                        "· 83% of disabled women will be sexual assaulted during their lifetime\n"+
                        "· 15% of sexual assault victims are boys under 16\n"+
                        "· half of all sexual offenders are married or in long term relationships\n"+
                        "· 57% of aboriginal women have been sexually abused\n"+
                        "· 1/5th of all sexual assaults involve a weapon of some sort\n"+
                        "· 80% of assailants are friends and family of the victim\n"
        ));

        addQuestion(createQuestionItem(
                ++counter,
                "Consent",
                "Consent is in place when there is a clear agreement to engage in a specific activity from both parties. \n"+
                        "Consent cannot be given when:\n"+
                        "Someone is incapacitated, whether due to drugs or alcohol or for any other reason\n"+
                        "Someone is unconscious or asleep\n"+
                        "Someone is under the age of consent (in Canada, there is some flexibility for peers aged 12-16, but 16 is the official age of consent, although the law also protects those under 18 from exploitation\n"+
                        "One person holds a position of power or authority over the other\n"+
                        "\n"+
                        "In Canadian law, the absence of a “no” does not mean “yes”; consent has to be affirmative and ongoing, meaning that consent to one activity does not mean consent to anything else. \n"+
                        "You can also change your mind at any point- consent can be revoked at any point after it has been given. Furthermore, consent to one sexual act does not imply or provide consent for further sexual acts.\n"
        ));


        addQuestion(createQuestionItem(
                ++counter,
                "Date Rape Drugs",
                "Alcohol:\n" +
                        "·Is the most widely used date rape drug\n" +
                        "·Being intoxicated means you cannot consent\n" +
                        "·If you think this has happened to you, it is best to go to the hospital, and if you do, don’t urinate beforehand so that your urine can be tested in case there are remaining traces of the drug\n" +
                        "Rohypnol/Roofies:\n" +
                        "·Appearance: colourless, odorless pill that dissolves into liquids\n" +
                        "·Symptoms: sometimes felt within half an hour; slurred speech, trouble standing, loss of muscle control, nausea, confusion, feeling paralyzed\n" +
                        "·How long it lasts: up to several hours; you might also wake up with a headache, unable to remember parts of the night\n" +
                        "·If you think this has happened to you, it is best to go to the hospital, and if you do, don’t urinate beforehand so that your urine can be tested in case there are remaining traces of the drug\n" +
                        "GHB:\n" +
                        "·Appearance: odourless, colourless liquid or powder; usually added to drinks, in which case the drink may have a slight salty taste, although this is less likely with sugary drinks\n" +
                        "·Symptoms: can begin to have effects after 15 minutes;  nausea, drowsiness, dizziness, vomiting, tremors, sweating, vomiting, slow heart rate, dream-like feeling, breathing problems, loss of consciousness, problems seeing, and not remembering what happened while drugged later on\n" +
                        "·How long it lasts: can last as long as 3-4 hours and completely leaves the body after 12 hours\n" +
                        "Ketamine:\n" +
                        "·Appearance: powder or liquid\n" +
                        "·Symptoms: inability to move or to remember what happened later; distorted perceptions of space and time, nausea and vomiting, out of body experiences, slurred speech, breathing or memory problems, convulsions, numbness, increased aggressiveness\n"
        ));

        addQuestion(createQuestionItem(
                ++counter,
                "Quiz",
                "Determine whether or not the following scenarios are examples of sexual assault/harassment. For each, indicate whether the scenario reflects consent or not.\n" +
                        "1. A high school student shows up to class and a group of boys and girls start commenting on the length of her shorts, calling her names, and saying she looks “slutty”.\n" +
                        "This is an example of verbal harassment. The group has no reason to discuss the student’s clothing choices, and by using objectifying language they are making her feel uncomfortable.\n" +
                        "\n" +
                        "2. Someone at a concert is talking to someone else they are interested in. They move closer and start touching the other person inappropriately. When the other person pushes them away, they explain that they interpreted their body language as wanting sex.\n" +
                        "This is more than just a misunderstanding, it is an example of sexual assault. Body language is in no way a substitute for verbal consent, and the person did not allow the other person to touch them.\n" +
                        "\n" +
                        "3. Two friends are at a party playing beer pong against one another. After the game is over, they engage in conversation and one of them starts kissing the other. The person being kissed does nothing to stop this from happening.  \n" +
                        "Regardless of whether or not the person said yes, being intoxicated means the person is not in a frame of mind to give legal consent.\n" +
                        "\n" +
                        "4. A married couple come home after a long day at work. One partner decides to go to bed right away, while the other takes their time getting ready. The sleeping partner wakes up to find the other partner feeling them, and trying to get them “in the mood”.\n" +
                        "Being in a relationship with someone doesn’t mean you have automatic rights to their body. No matter how long you have been together, each party must still consent to any sexual activity.\n" +
                        "\n" +
                        "5. Two people mutually decide to have sex. Part way through one of them gets scared and decides they aren’t into it anymore. The other person continues while trying to convince them that they will enjoy it.\n" +
                        "Everyone has the right to change their mind, even if they agreed initially. Consent is an ongoing process and can be revoked at any point. Even though this started as consensual sex, it became sexual assault once the second person tried to stop it.\n" +
                        "\n" +
                        "6. A person is walking down the sidewalk of a busy street when someone across the road whistles at them. They ignore the whistle and continue walking, but the person continues to whistle.\n" +
                        "This is an example of sexual harassment.\n" +
                        "\n" +
                        "7. At a busy club, a group of friends are dancing together and having fun. In an effort to get through the group, a person walks by one of the friends, obviously touching them on the chest.\n" +
                        "Being in an atmosphere such as a club does not excuse any non-consensual sexual behaviour. Regardless of whether or not it is the norm to voluntarily touch people in situations like this, it is still sexual assault.\n" +
                        "\n" +
                        "8. A couple that has been dating for 4 months decide they want to have sex. Both parties say yes.\n" +
                        "The fact that the decision to have sex was verbally agreed upon by both people in the relationship means that this is an example of consensual sex. Only yes means yes."
        ));

    }



    private static void addQuestion(Questions question) {
        QUESTIONS.add(question);
        QUESTIONS_MAP.put(question.id, question);
    }

    //Questions constructor
    private static Questions createQuestionItem(int position, String content, String details ) {
        return new Questions(String.valueOf(position), content , details);
    }


    /**
     * The Question class (blueprint for question objects)
     */
    public static class Questions {
        public final String id;
        public final String content;
        public final String details;
        //constructor
        public Questions(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}

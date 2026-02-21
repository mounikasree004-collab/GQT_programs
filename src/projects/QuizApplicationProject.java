package projects;
import javax.swing.JOptionPane;
public class QuizApplicationProject {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog(null, "Enter your Name :");
		JOptionPane.showMessageDialog(null, "Welcome " + name + ", Let’s start the Game.\n\nTotal 10 Questions");
		        String[] questions = {
		                "Which city is known as the “Pink City” of India?",
		                "Where is the Taj Mahal located?",
		                "Which Indian state is famous for its backwaters?",
		                "The Ajanta and Ellora Caves are located in which state?",
		                "Which city is called the “City of Lakes”?",
		                "Where is Shimla located?",
		                "Which city is famous for Golden Temple?",
		                "Which is called Temple City of India?",
		                "Where are the Sundarbans located?",
		                "Which state is famous for houseboats?"
		        };
		        String[][] options = {
		                {"Jaipur", "Udaipur", "Jodhpur", "Delhi"},
		                {"Delhi", "Agra", "Jaipur", "Lucknow"},
		                {"Tamil Nadu", "Kerala", "Karnataka", "Goa"},
		                {"Maharashtra", "Madhya Pradesh", "Odisha", "Gujarat"},
		                {"Udaipur", "Srinagar", "Bhopal", "Coorg"},
		                {"Himachal Pradesh", "Uttarakhand", "Sikkim", "Jammu & Kashmir"},
		                {"Varanasi", "Delhi", "Lucknow", "Amritsar"},
		                {"Varanasi", "Khajuraho", "Madurai", "Kanchipuram"},
		                {"West Bengal", "Odisha", "Bihar", "Jharkhand"},
		                {"Goa", "Kerala", "Tamil Nadu", "Karnataka"}
		        };
		        int[] answers = {1, 2, 2, 1, 1, 1, 4, 3, 1, 2};
		        int[] rewards = {1000, 2000, 3000, 5000, 6000, 7000, 8000, 9000, 10000, 11000};

		        boolean audienceUsed = false;
		        boolean fiftyUsed = false;
		        int totalScore = 0;

		        for (int i = 0; i < questions.length; i++) {

		            String message = "Question " + (i + 1) + "\n\n" + questions[i] + "\n\n";
		            for (int j = 0; j < 4; j++) {
		                message += (j + 1) + ". " + options[i][j] + "\n";
		            }
		            if (i != 9) {
		                message += "5. Lifeline\n";
		            }

		            String input = JOptionPane.showInputDialog(null, message);
		            int choice = Integer.parseInt(input);

		            if (i == 9 && choice == 5) {
		                JOptionPane.showMessageDialog(null,
		                        "Lifeline is not allowed for the last question!");
		                i--;
		                continue;
		            }

		            if (choice == 5 && i != 9) {

		                if (!audienceUsed || !fiftyUsed) {

		                    String lifeMsg = "Choose Lifeline:\n";
		                    if (!audienceUsed)
		                        lifeMsg += "1. Audience Poll\n";
		                    if (!fiftyUsed)
		                        lifeMsg += "2. 50-50\n";

		                    int life = Integer.parseInt(
		                            JOptionPane.showInputDialog(null, lifeMsg));

		                    if (life == 1 && !audienceUsed) {

		                        String poll = "Audience Poll Results:\n\n";
		                        for (int opt = 1; opt <= 4; opt++) {
		                            if (opt == answers[i]) {
		                                poll += "Option " + opt + " : 55%\n";
		                            } else {
		                                poll += "Option " + opt + " : 15%\n";
		                            }
		                        }
		                        JOptionPane.showMessageDialog(null, poll);
		                        audienceUsed = true;

		                    } else if (life == 2 && !fiftyUsed) {

		                        JOptionPane.showMessageDialog(null,
		                                "50-50: Correct option is " + answers[i]);
		                        fiftyUsed = true;

		                    } else {
		                        JOptionPane.showMessageDialog(null,
		                                "Lifeline already used!");
		                    }

		                } else {
		                    JOptionPane.showMessageDialog(null,
		                            "No lifelines available! Choose the correct answer.");
		                }

		                i--;
		                continue;
		            }

		            if (choice == answers[i]) {
		                totalScore += rewards[i];
		                JOptionPane.showMessageDialog(null,
		                        "Congratulations " + name +
		                                "!\nYour answer is correct.\nYou won ₹" + rewards[i]);
		            } else {
		                JOptionPane.showMessageDialog(null,
		                        "Sorry " + name +
		                                ", Your answer is wrong!\nGame Over.");
		                break;
		            }
		        }

		        JOptionPane.showMessageDialog(null,
		                "Quiz Completed\n\nTotal Score: ₹" + totalScore +
		                        "\n\nThank you " + name + " for participating in this Quiz.");
	}
}

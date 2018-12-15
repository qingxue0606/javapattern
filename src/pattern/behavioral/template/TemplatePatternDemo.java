package pattern.behavioral.template;

/**
 * @author xiang
 * @date 2018/12/14
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }

}

package example.game_ai;

import example.game_ai.template.GameAI;
import example.game_ai.template.HumanAI;
import example.game_ai.template.MonsterAI;
import example.game_ai.template.OrcsAI;

public class Main {

    public static void main(String[] args) {
        GameAI human = new HumanAI();
        human.buildAi();

        GameAI orcs = new OrcsAI();
        orcs.buildAi();

        GameAI monster = new MonsterAI();
        monster.buildAi();
    }

}

import kr.ac.kaist.se.model.abst.evnt.EnumEventType;
import kr.ac.kaist.se.simdata.evnt.*;
import kr.ac.kaist.se.simdata.input.SimConfiguration;
import kr.ac.kaist.se.simdata.input.SimScenario;

public class Main {

    /**
     * @param args args[0]: isGuiMode (0/others)
     *             args[1]: isOnMape (0/others)
     *             args[2]: is
     */
    public static void main(String[] args) {
        /* Input SimModel */
        //ToySoS toySoS = new ToySoS(); // no id
        ToySoS toySoS = new ToySoS("TOYSOS01", "ToySoS");

        /* Input SimConfiguration */
        //TODO: remove this setion after debugging
        SimConfiguration exampleConfig = new SimConfiguration();
        exampleConfig.setSimTotalTime(1);

        /* Input SimScenario */
        //TODO: remove this section after debugging
        SimScenario exampleScenario = new SimScenario("Scenario01", false);
        // addScenarioEvents(exampleScenario, exampleConfig);

        Execution.main(args, toySoS, exampleConfig, exampleScenario);

    }

    private static void addScenarioEvents(SimScenario simScenario, SimConfiguration simConfiguration) {

        //INSTANT (50, 70, 30, -1)
        SimScenarioEvent event01 = new SimScenarioEvent("event01",
                "event01",
                EnumEventType.VALUE_UPDATE,
                simConfiguration.getSimTotalTime(),
                null,
                null,
                EnumEventTargetScope.SINGLE_OBJECT,
                EnumEventPredefBehavior.NOT_DETERMINED,
                EnumEventOccPattern.INSTANT,
                50, 70,
                30,
                -1,
                false,
                EnumEventProbDist.NOT_PROBABILISTIC,
                null);

        //CONSTANT (60, 90, -1, -1)
        SimScenarioEvent event02 = new SimScenarioEvent("event02",
                "event02",
                EnumEventType.VALUE_UPDATE,
                simConfiguration.getSimTotalTime(),
                null,
                null,
                EnumEventTargetScope.SINGLE_OBJECT,
                EnumEventPredefBehavior.NOT_DETERMINED,
                EnumEventOccPattern.CONSTANT,
                60, 90,
                -1,
                -1,
                false,
                EnumEventProbDist.NOT_PROBABILISTIC,
                null);

        //PERIODIC (78, 89, 3, 5)
        SimScenarioEvent event03 = new SimScenarioEvent("event03",
                "event03",
                EnumEventType.VALUE_UPDATE,
                simConfiguration.getSimTotalTime(),
                null,
                null,
                EnumEventTargetScope.SINGLE_OBJECT,
                EnumEventPredefBehavior.NOT_DETERMINED,
                EnumEventOccPattern.PERIODIC,
                78, 89,
                3,
                5,
                false,
                EnumEventProbDist.NOT_PROBABILISTIC,
                null);

        simScenario.addSimScenarioEvent(event01);
        simScenario.addSimScenarioEvent(event02);
        simScenario.addSimScenarioEvent(event03);

    }

}

package fcm.model.fcm;

import java.util.List;

public class FlightConsolidationMessage {

    private boolean userOverride;

    private boolean incompleteParsed;

    private FlightConsolidationMessageID messageID;

    private FlightConsolidationMessageSource messageSource;

    private List<FlightConsolidationRecord> records;

    private FlightID flightID;

    private List<FlightConsolidationMessageProcessInfo> processInfo;

    private FlightConsolidationSourceInformation sourceInformation;

}

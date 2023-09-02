package org.apache.fineract.infrastructure.event.external.service.serialization.mapper.generic;

import javax.annotation.processing.Generated;
import org.apache.fineract.avro.generic.v1.CommandProcessingResultV1;
import org.apache.fineract.infrastructure.core.data.CommandProcessingResult;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-02T12:28:21+0530",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.2.jar, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class CommandProcessingResultMapperImpl implements CommandProcessingResultMapper {

    @Override
    public CommandProcessingResultV1 map(CommandProcessingResult source) {
        if ( source == null ) {
            return null;
        }

        CommandProcessingResultV1 commandProcessingResultV1 = new CommandProcessingResultV1();

        commandProcessingResultV1.setCommandId( source.getCommandId() );
        commandProcessingResultV1.setOfficeId( source.getOfficeId() );
        commandProcessingResultV1.setGroupId( source.getGroupId() );
        commandProcessingResultV1.setClientId( source.getClientId() );
        commandProcessingResultV1.setLoanId( source.getLoanId() );
        commandProcessingResultV1.setSavingsId( source.getSavingsId() );
        commandProcessingResultV1.setResourceId( source.getResourceId() );
        commandProcessingResultV1.setSubResourceId( source.getSubResourceId() );
        if ( source.getTransactionId() != null ) {
            commandProcessingResultV1.setTransactionId( Long.parseLong( source.getTransactionId() ) );
        }
        commandProcessingResultV1.setResourceIdentifier( source.getResourceIdentifier() );
        commandProcessingResultV1.setProductId( source.getProductId() );
        commandProcessingResultV1.setGsimId( source.getGsimId() );
        commandProcessingResultV1.setGlimId( source.getGlimId() );

        return commandProcessingResultV1;
    }
}

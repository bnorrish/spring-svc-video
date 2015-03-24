package ban.client;

import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;

import org.springframework.stereotype.Component;

@Component
public class AwsDynamoClient {

  AmazonDynamoDBClient dynamoClient;
  DynamoDBMapper dynamoMapper;

  public AwsDynamoClient() {

    dynamoClient = new AmazonDynamoDBClient(new ProfileCredentialsProvider());
    dynamoMapper = new DynamoDBMapper(dynamoClient);

  }

}

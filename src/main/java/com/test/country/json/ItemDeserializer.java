//import java.io.IOException;
//
//import com.fasterxml.jackson.core.JsonParser;
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.JsonNode;
//import com.fasterxml.jackson.databind.node.IntNode;
//import com.test.country.model.CountryObj;
//
//public class ItemDeserializer extends StdDeserializer<Item> { 
// 
//    public ItemDeserializer() { 
//        this(null); 
//    } 
// 
//    public ItemDeserializer(Class<?> vc) { 
//        super(vc); 
//    }
// 
//    @Override
//    public Item deserialize(JsonParser jp, DeserializationContext ctxt) 
//      throws IOException, JsonProcessingException {
//        JsonNode node = jp.getCodec().readTree(jp);
//        int id = (Integer) ((IntNode) node.get("id")).numberValue();
//        String itemName = node.get("iso2Code").asText();
//        int userId = (Integer) ((IntNode) node.get("createdBy")).numberValue();
// 
//        return new CountryObj(id, countryCode, capitalCity, region, incomeLevel, lendingType, longitude, latitude)
//    }
//}
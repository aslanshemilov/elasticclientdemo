package nl.gridshore.employees;

import com.fasterxml.jackson.core.type.TypeReference;
import eu.luminis.elastic.search.response.QueryResponse;

/**
 * TypeReference ref = new TypeReference<ResponseHits<Employee>>() {};
 */
public class EmployeeTypeReference extends TypeReference<QueryResponse<Employee>> {
}

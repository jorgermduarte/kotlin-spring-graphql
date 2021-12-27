package pt.jorgeduarte.kotlingraphqlclient.controllers

import com.expediagroup.graphql.client.spring.GraphQLWebClient
import com.trevorblades.countries.GetCountryDetails
import org.jetbrains.annotations.NotNull
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MainController {
    @RequestMapping("/country/{code}")
    public suspend fun getDefault(@PathVariable @NotNull code: String): GetCountryDetails.Result? {
        val client = GraphQLWebClient(url = "https://countries.trevorblades.com/graphql")
        val query = GetCountryDetails(
            GetCountryDetails.Variables(
            code = code
        ))
        val result = client.execute(query)
        return result.data
    }
}
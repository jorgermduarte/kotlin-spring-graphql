# kotlin-spring-graphql
A kotlin example project using graphql as a client with com.expediagroup.graphql

# Dependencies

```xml
plugins {
    id("com.expediagroup.graphql") version $latestGraphQLKotlinVersion
}
```

```xml
dependencies {
  implementation("com.expediagroup", "graphql-kotlin-schema-generator", latestVersion)
  implementation("com.expediagroup:graphql-kotlin-spring-client:$latestGraphQLKotlinVersion")
}
```

# More information
- https://opensource.expediagroup.com/graphql-kotlin/docs/schema-generator/schema-generator-getting-started
- https://opensource.expediagroup.com/graphql-kotlin/docs/client/client-overview


### Usage running example
**GET** https://localhost:8080/country/AL

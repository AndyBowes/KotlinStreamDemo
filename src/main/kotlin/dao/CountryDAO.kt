package dao

import com.github.salomonbrys.kotson.*
import com.google.gson.Gson
import domain.Country
import java.io.InputStreamReader
import java.io.Reader

/**
 * Load Countries from JSON File
 */
fun loadCountries(): List<Country> {
    val gson = Gson()
    val reader: Reader = InputStreamReader(Gson::class.java.getResourceAsStream("/countries.json"))
    val countries = gson.fromJson<List<Country>>(reader)
    return countries
}

/**
 * Data Access Object to Fetch Details of Countries
 */
class CountryDAO {
    private val countries: List<Country> by lazy { loadCountries() }

    fun findCountryByIsoCode(isoCode:String) : Country?{
        // TODO - Complete this method (use firstOrNull)
        return null
    }

    fun findCountriesByRegion(region: String) : List<Country> {
        // TODO - Complete this method
        return emptyList()
    }

    fun findCountriesByRegionAndSubregion(region: String, subregion: String) : List<Country> {
        // TODO - Complete this method
        return emptyList()
    }

    fun fetchCapitalCities(): List<String>{
        // TODO - Complete this method
        return emptyList()
    }

    fun findLargestCountriesByRegion(region:String, rowCount:Int = 5): List<Country>{
        // TODO - Complete this method
        return emptyList()
    }

    fun findAverageSizeOfCountries(): Double{
        // TODO - Complete this method
        return 0.0
    }

    fun splitByLandLockedStatus(): Pair<List<Country>,List<Country>>{
        // TODO - Complete this method
        return Pair(emptyList(),emptyList())
    }

    fun fetchCountryNamesGroupedByRegion(): Map<String, List<String>>{
        // TODO - Complete this method
        return emptyMap()
    }

}


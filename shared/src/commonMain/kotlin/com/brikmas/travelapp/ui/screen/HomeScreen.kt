package com.brikmas.travelapp.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.brikmas.travelapp.Navigation.Route
import com.brikmas.travelapp.Navigation.Screen
import com.brikmas.travelapp.SharedRes
import com.brikmas.travelapp.data.FakeCategories
import com.brikmas.travelapp.data.FakeDestinations
import com.brikmas.travelapp.model.Destination
import com.brikmas.travelapp.ui.component.ChildLayout
import com.brikmas.travelapp.ui.component.LoadItemAfterSafeCast
import com.brikmas.travelapp.ui.component.TitleWithViewAllItem
import com.brikmas.travelapp.ui.component.VerticalScrollLayout
import com.brikmas.travelapp.ui.component.destinationSmallItem
import com.brikmas.travelapp.ui.component.homeHeader
import com.brikmas.travelapp.ui.component.loadCategoryItems
import com.brikmas.travelapp.ui.component.loadDestinationLargeItems
import com.brikmas.travelapp.util.BOTTOM_NAV_SPACE

enum class HomeScreenContents{
    HEADER_SECTION,
    CATEGORY_VIEW_ALL,
    CATEGORY_SECTION,
    DESTINATION_LARGE_SECTION,
    DESTINATION_VIEW_ALL,
    DESTINATION_SMALL_SECTION,
}
@Composable
fun HomeScreen(routeState: MutableState<Route>){
    Surface(modifier = Modifier.fillMaxWidth().padding(bottom = BOTTOM_NAV_SPACE)) {
        var destinations by remember { mutableStateOf(FakeDestinations.destinations) }
        VerticalScrollLayout(
            modifier = Modifier.fillMaxSize()
                .background(color = MaterialTheme.colorScheme.background),
            ChildLayout(
                contentType = HomeScreenContents.HEADER_SECTION.name,
                content = {
                    homeHeader()
                }
            ),
            ChildLayout(
                contentType = HomeScreenContents.CATEGORY_VIEW_ALL.name,
                content = {
                    TitleWithViewAllItem("Categorias", "Ver todas", SharedRes.images.arrow_forward)
                }
            ),
            ChildLayout(
                contentType = HomeScreenContents.CATEGORY_SECTION.name,
                content = {
                    loadCategoryItems(FakeCategories.categories) { category ->
                        when(category.title)  {
                            "All" -> destinations = FakeDestinations.destinations
                            else -> destinations = arrayListOf<Destination>().apply {
                                addAll(FakeDestinations.destinations.filter { it.category == category })
                            }
                        }
                    }
                }
            ),
            ChildLayout(
                contentType = HomeScreenContents.DESTINATION_LARGE_SECTION.name,
                content = {
                    loadDestinationLargeItems(destinations) {
                        routeState.value = Route(
                            screen = Screen.DestinationDetail(it),
                            prev = Screen.Home
                        )
                    }
                }
            ),
            ChildLayout(
                contentType = HomeScreenContents.DESTINATION_VIEW_ALL.name,
                content = {
                    TitleWithViewAllItem("Destinos populares", "Ver todos", SharedRes.images.arrow_forward)
                }
            ),
            ChildLayout(
                contentType = HomeScreenContents.DESTINATION_SMALL_SECTION.name,
                items = FakeDestinations.destinations,
                content = { item ->
                    LoadItemAfterSafeCast<Destination>(item) {
                        destinationSmallItem(it) {
                            routeState.value = Route(
                                screen = Screen.DestinationDetail(it),
                                prev = Screen.Home
                            )
                        }
                    }
                }
            )
        )
    }
}
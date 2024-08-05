package com.brikmas.travelapp.data

import com.brikmas.travelapp.SharedRes
import com.brikmas.travelapp.model.Category

object FakeCategories {

    val categories = arrayListOf<Category>().apply {
        add(Category(0, "Todos", SharedRes.images.star))
        add(Category(1, "Montanhas", SharedRes.images.category1))
        add(Category(2, "Cachoeiras", SharedRes.images.category2))
        add(Category(3, "Riachos", SharedRes.images.category3))
        add(Category(4, "Lagos", SharedRes.images.category4))
    }
}

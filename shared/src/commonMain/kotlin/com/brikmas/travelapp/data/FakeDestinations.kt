package com.brikmas.travelapp.data

import com.brikmas.travelapp.model.Destination

object FakeDestinations {
    val destinations = arrayListOf<Destination>().apply {
        add(
            Destination(
                id = 1,
                thumbnail = "https://images.unsplash.com/photo-1660020214290-800d5775a867?q=80&w=2833&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
                title = "Montanhas de Lombok",
                description = "As montanhas de Lombok, na Indonésia, são um destino encantador para aventureiros e amantes da natureza. Dominada pelo majestoso Monte Rinjani, o segundo vulcão mais alto do país, Lombok oferece trilhas deslumbrantes que passam por florestas exuberantes e paisagens impressionantes. O trekking até o cume do Monte Rinjani, com seus 3.726 metros, é uma experiência inesquecível para qualquer viajante.",
                rating = 4.3f,
                location = "Lombok, Indonésia",
                price = "R$ 700",
                type = "Pessoa",
                category = FakeCategories.categories[0],
                image = arrayListOf(
                    "https://plus.unsplash.com/premium_photo-1674228288323-3bfbae70ad45?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1587&q=80",
                    "https://images.unsplash.com/photo-1689714321677-a914620d6b76?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1600&q=80",
                    "https://images.unsplash.com/photo-1612253166766-c88431cdadee?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1587&q=80",
                    "https://images.unsplash.com/photo-1533305120462-aed774147024?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1470&q=80"
                )
            )
        )
        add(
            Destination(
                id = 1,
                thumbnail = "https://images.unsplash.com/photo-1682685794761-c8e7b2347702?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1470&q=80",
                title = "Montanhas de Bromo",
                description = "As Montanhas de Bromo, na Indonésia, são um destino icônico conhecido por suas paisagens vulcânicas impressionantes. O Monte Bromo, com sua cratera ativa e vistas espetaculares, oferece uma experiência visual única ao nascer do sol. Rodeado por um vasto deserto de areia e outros vulcões, é um local imperdível para aventureiros e fotógrafos.",
                rating = 4.0f,
                location = "Bromo, Indonésia",
                price = "R$ 700",
                type = "Pessoa",
                category = FakeCategories.categories[1],
                image = arrayListOf(
                    "https://images.unsplash.com/photo-1690315854810-dfeb1c763c27?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1470&q=80",
                    "https://images.unsplash.com/photo-1689714321677-a914620d6b76?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1600&q=80",
                    "https://images.unsplash.com/photo-1690315854810-dfeb1c763c27?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1470&q=80",
                    "https://images.unsplash.com/photo-1690205073996-7fde74f5fd56?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1470&q=80"
                )
            )
        )
        add(
            Destination(
                id = 1,
                thumbnail = "https://images.unsplash.com/photo-1682687220198-88e9bdea9931?ixlib=rb-4.0.3&ixid=M3wxMjA3fDF8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=2070&q=80",
                title = "Montanhas de Rinjani",
                description = "As Montanhas de Rinjani, na Indonésia, oferecem vistas espetaculares e aventuras emocionantes. Dominadas pelo imponente Monte Rinjani, o segundo vulcão mais alto do país, esta região é ideal para trekkings desafiadores e contempla paisagens deslumbrantes, incluindo lagos de crateras e florestas exuberantes. É um paraíso para os amantes da natureza e do montanhismo.",
                rating = 2.7f,
                location = "Rinjani, Indonésia",
                price = "R$ 900",
                type = "Pessoa",
                category = FakeCategories.categories[3],
                image = arrayListOf(
                    "https://images.unsplash.com/photo-1682686580024-580519d4b2d2?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1yZWxhdGVkfDExfHx8ZW58MHx8fHx8&auto=format&fit=crop&w=900&q=60",
                    "https://images.unsplash.com/photo-1682686578289-cf9c8c472c9b?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1470&q=80",
                    "https://images.unsplash.com/photo-1682695794816-7b9da18ed470?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1470&q=80",
                    "https://images.unsplash.com/photo-1682695795255-b236b1f1267d?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1470&q=80"
                )
            )
        )
    }
}
Map preferences1 = [
    "Renato": [ "Marguerita" : 4, "QuatroQueijos" : 5, "Escarola" : 4, "Portuguesa" : 5, "FrangoCatupiry" : 4, "Napolitana" : 3 ],
    "Marcelo" : [ "Marguerita" : 2, "QuatroQueijos" : 2, "Escarola" : 1, "Portuguesa" : 3, "FrangoCatupiry" : 5, "Napolitana" : 2 ],
    "Lenon" : [ "Marguerita" : 4, "QuatroQueijos" : 5, "Escarola" : 2, "Portuguesa" : 1, "FrangoCatupiry" : 1, "Napolitana" : 3 ],
    "Renata" : [ "Marguerita" : 4, "QuatroQueijos" : 5, "Escarola" : 1, "Portuguesa" : 1, "FrangoCatupiry" : 3, "Napolitana" : 4 ],
    "Washington" : [ "Marguerita" : 1, "QuatroQueijos" : 1, "Escarola" : 2, "Portuguesa" : 3, "FrangoCatupiry" : 4, "Napolitana" : 3 ],
    "Tino" : [ "Marguerita" : 1, "QuatroQueijos" : 5, "Escarola" : 1, "Portuguesa" : 4, "FrangoCatupiry" : 3, "Napolitana" : 2 ],
    "Charlie Primeiro" : ["Marguerita" : 5, "QuatroQueijos": 4, "Escarola" : 3, "Portuguesa" : 4, "FrangoCatupiry" : 3, "Napolitana" : 2],
    "John Segundo" : ["Marguerita" : 4, "QuatroQueijos": 3, "Escarola" : 5, "Portuguesa" : 4, "FrangoCatupiry" : 3, "Napolitana" : 2]
]

public String getMatch(Map myChoices, Map preferences) {
    Map diffs = [:]

    // diffs = ["Renato": 1]

    preferences.each { person ->
        diffs[person.key] = 0
        person.value.each { topping ->
            diffs[person.key] += (myChoices[topping.key] - topping.value).abs()
        }
    }

    return diffs.min { a, b -> a.value <=> b.value  }.key
}

public void matcher(Map preferences) {
    int j = 0
    List<List<String>> matches = []
    preferences.each { person ->
        if (matches.flatten().contains(person.key)) {
            return
        }
        println(person.key + person.value)
        matches.add([person.key, getMatch(person.value, preferences.findAll { it.key != person.key && !matches.flatten().contains(it.key) })])
    }
    println matches
}

matcher(preferences1)
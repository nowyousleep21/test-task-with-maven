def static countElements(list) {
    def countMap = [:]

    list.each { element ->
        countMap[element] = countMap.getOrDefault(element, 0) + 1
    }

    return countMap
}

def list = [1, 2, 3, 1, 3, 4, 5, 4, 2, 5, 5]
def countMap = countElements(list)

println(countMap)
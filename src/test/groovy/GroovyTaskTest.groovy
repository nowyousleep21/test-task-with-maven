import spock.lang.Specification

class GroovyTaskTest extends Specification {
    def "test countElements"() {
        given:
        List<Integer> nums = [1, 2, 3, 2, 1, 3, 3, 4, 5, 4]

        when:
        Map<Integer, Integer> countMap = GroovyTask.countElements(nums)

        then:
        countMap == [1: 2, 2: 2, 3: 3, 4: 2, 5: 1]
    }
}
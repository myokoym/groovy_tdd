import groovy.util.GroovyTestCase

class MessageFilterTest extends GroovyTestCase {
  void testDetectMessageWithNGWord() {
    def filter = new MessageFilter('foo')
    def expected = true
    def actual = filter.isDetect('hello from foo')
    assert expected == actual
  }
}


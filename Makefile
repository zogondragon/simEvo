JFLAGS = -g -verbose -Xlint
JC = javac
.SUFFIXES: .java .class

.java.class:
		$(JC) $(JFLAGS) $*.java

CLASSES = \
		Test.java \
		engine/Engine.java \
		engine/Tile.java \
		engine/Map.java \
		engine/QuadTree.java \
		view/View.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
		find . -name "*.class" -exec rm -f {} \;

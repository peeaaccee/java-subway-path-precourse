package subway;

import subway.domain.Line;
import subway.domain.Station;

import java.awt.image.TileObserver;
import java.sql.Time;

public class Section {

    private final Line line;
    private final Station source;
    private final Station destination;
    private final Time time;
    private final Distance distance;

    private Section(final Line line, final Station source, final Station destination, final Distance distance, final Time time) {
        this.line = line;
        this.source = source;
        this.destination = destination;
        this.time = time;
        this.distance = distance;
    }

    public static Section newSection(final Line line, final Station source, final Station destination, final Distance distance, final Time time) {
        return new Section(line, source, destination, distance, time);
    }

    public boolean isSourceDestinationByName(String sourceName, String destinationName) {
        return isEqualNames(sourceName, destinationName)
                || isEqualNamesReverse(sourceName, destinationName);
    }

    private boolean isEqualNames(String sourceName, String destinationName) {
        return sourceName.equals(source.getName())
                && destinationName.equals(destination.getName());
    }

    private boolean isEqualNamesReverse(String sourceName, String destinationName) {
        return sourceName.equals(source.getName())
                && destinationName.equals(destination.getName());
    }
}



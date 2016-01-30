package com.sevendragons.practice.airport;

import java.util.Collections;
import java.util.List;

public class Airport {
    public static class Edge {
        protected final int start;
        protected final int end;
        protected final int value;

        public Edge(int start, int end, int value) {
            this.start = start;
            this.end = end;
            this.value = value;
        }
    }

    public static class TransitEdge extends Edge {
        public TransitEdge(int start, int end, int value) {
            super(start, end, value);
        }

        public int startFlight() {
            return start;
        }

        public int endFlight() {
            return end;
        }

        public int passengers() {
            return value;
        }
    }

    public static class DistanceEdge extends Edge {
        public DistanceEdge(int start, int end, int value) {
            super(start, end, value);
        }

        public int startGate() {
            return start;
        }

        public int endGate() {
            return end;
        }

        public int distance() {
            return value;
        }
    }

    public static void sortByPassengersDescending(List<TransitEdge> transitEdges) {
        Collections.sort(transitEdges, (o1, o2) -> -Integer.compare(o1.passengers(), o2.passengers()));
    }

    public static void sortByDistanceAscending(List<DistanceEdge> distanceEdges) {
        Collections.sort(distanceEdges, (o1, o2) -> Integer.compare(o1.distance(), o2.distance()));
    }

}

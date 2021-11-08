package com.goya.interf;

/**
 * @author goya
 * @create 2021-04-23 23:28
 */
public class FilterAdapter implements Processor{

    Filter filter;

    public FilterAdapter(Filter filter) {
        this.filter = filter;
    }

    @Override
    public String name() {
        return filter.name();
    }

    @Override
    public Object process(Object input) {
        return filter.process((Waveform) input);
    }
}

class FilterProcessor{

    public static void main(String[] args) {
        Waveform w = new Waveform();
        Apply.process(new FilterAdapter(new LowPass(1.0)),w);
        Apply.process(new FilterAdapter(new HighPass(2.0)),w);
        Apply.process(new FilterAdapter(new BandPass(3.0,4.0)),w);
    }

    private static class LowPass extends Filter {
        double cutoff;
        public LowPass(double cutoff) {
            super();
            this.cutoff = cutoff;
        }

        public Waveform process(Waveform input){
            return input;
        }
    }

    private static class HighPass extends Filter {
        double cutoff;
        public HighPass(double cutoff) {
            super();
            this.cutoff = cutoff;
        }

        public Waveform process(Waveform input){
            return input;
        }
    }

    private static class BandPass extends Filter {
        double lowCutoff, highCutoff;
        public BandPass(double lowCut, double highCut) {
            super();
            lowCutoff = lowCut;
            highCutoff = highCut;
        }

        public Waveform process(Waveform input){
            return input;
        }
    }
}
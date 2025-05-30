public class VideoConversionFacade {

    public VideoFile convert(VideoFile file, Codec targetCodec) {
        System.out.println("\n======= VideoConversionFacade: conversion started. =======");

        Codec sourceCodec = CodecFactory.extract(file);
        Buffer buffer = BitrateReader.read(file, sourceCodec);
        VideoFile result = BitrateReader.convert(buffer, file.getName(), targetCodec);
        AudioMixer audioMixer = new AudioMixer();
        audioMixer.fix(result, file.getAudioBuffer());

        System.out.println("====== VideoConversionFacade: conversion completed =======\n");
        return result;
    }
}

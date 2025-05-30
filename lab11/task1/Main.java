public class Main {

    public static void main(String[] args) {
        String fileName = "youtubevideo.ogg";

        VideoFile videoFile = new VideoFile(
            fileName,
            new Buffer("Byte buffer of video"),
            new Buffer("Byte buffer of audio")
        );

        // Демонстрація спроби програвання з неправильним кодеком
        videoFile.play(new MPEG4CompressionCodec());

        // Використання фасаду для конвертації у формат MP4
        VideoConversionFacade facade = new VideoConversionFacade();
        VideoFile converted = facade.convert(videoFile, new MPEG4CompressionCodec());

        // Програвання сконвертованого відео з правильним кодеком
        converted.play(new MPEG4CompressionCodec());
    }
}

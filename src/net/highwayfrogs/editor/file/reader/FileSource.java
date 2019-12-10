package net.highwayfrogs.editor.file.reader;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * Turns a file into a data source.
 * Created by Kneesnap on 8/10/2018.
 */
public class FileSource implements DataSource {
    private byte[] fileData;
    private int index;

    public FileSource(File file) throws IOException {
        this.fileData = Files.readAllBytes(file.toPath());
    }

    @Override
    public byte readByte() throws IOException {
        return this.fileData[this.index++];
    }

    @Override
    public byte[] readBytes(int amount) throws IOException {
        byte[] bytes = new byte[amount];
        System.arraycopy(this.fileData, this.index, bytes, 0, amount);
        this.index += amount;
        return bytes;
    }

    @Override
    public void skip(int byteCount) throws IOException {
        this.index += byteCount;
    }

    @Override
    public void setIndex(int newIndex) throws IOException {
        this.index = newIndex;
    }

    @Override
    public int getIndex() throws IOException {
        return this.index;
    }

    @Override
    public int getSize() throws IOException {
        return this.fileData.length;
    }
}

package org.zeroturnaround.zip;

public interface OnUnpackProgressListener {
    void onUnpackProgress(boolean isDirectory, int unpackFileCount, int totalCount,long unpackCompressedSize, long unpackSize);
}

/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A file to be downloaded from Azure blob storage to a compute node.
 */
public class ResourceFile {
    /**
     * The URL of the file within Azure Blob Storage.
     * This URL must be readable using anonymous access; that is, the Batch
     * service does not present any credentials when downloading the blob.
     * There are two ways to get such a URL for a blob in Azure storage:
     * include a Shared Access Signature (SAS) granting read permissions on
     * the blob, or set the ACL for the blob or its container to allow public
     * access.
     */
    @JsonProperty(required = true)
    private String blobSource;

    /**
     * The location on the compute node to which to download the file,
     * relative to the task's working directory.
     */
    @JsonProperty(required = true)
    private String filePath;

    /**
     * The file permission mode attribute in octal format.
     * This property applies only to files being downloaded to Linux compute
     * nodes. It will be ignored if it is specified for a resourceFile which
     * will be downloaded to a Windows node. If this property is not
     * specified for a Linux node, then a default value of 0770 is applied to
     * the file.
     */
    private String fileMode;

    /**
     * Get the blobSource value.
     *
     * @return the blobSource value
     */
    public String blobSource() {
        return this.blobSource;
    }

    /**
     * Set the blobSource value.
     *
     * @param blobSource the blobSource value to set
     * @return the ResourceFile object itself.
     */
    public ResourceFile withBlobSource(String blobSource) {
        this.blobSource = blobSource;
        return this;
    }

    /**
     * Get the filePath value.
     *
     * @return the filePath value
     */
    public String filePath() {
        return this.filePath;
    }

    /**
     * Set the filePath value.
     *
     * @param filePath the filePath value to set
     * @return the ResourceFile object itself.
     */
    public ResourceFile withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * Get the fileMode value.
     *
     * @return the fileMode value
     */
    public String fileMode() {
        return this.fileMode;
    }

    /**
     * Set the fileMode value.
     *
     * @param fileMode the fileMode value to set
     * @return the ResourceFile object itself.
     */
    public ResourceFile withFileMode(String fileMode) {
        this.fileMode = fileMode;
        return this;
    }

}

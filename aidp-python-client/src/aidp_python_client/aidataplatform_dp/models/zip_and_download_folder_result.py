# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ZipAndDownloadFolderResult(object):
    """
    Result of starting workspace folder zip creation for download.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ZipAndDownloadFolderResult object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param operation_key:
            The value to assign to the operation_key property of this ZipAndDownloadFolderResult.
        :type operation_key: str

        :param download_url:
            The value to assign to the download_url property of this ZipAndDownloadFolderResult.
        :type download_url: str

        :param archive_name:
            The value to assign to the archive_name property of this ZipAndDownloadFolderResult.
        :type archive_name: str

        """
        self.swagger_types = {
            'operation_key': 'str',
            'download_url': 'str',
            'archive_name': 'str'
        }

        self.attribute_map = {
            'operation_key': 'operationKey',
            'download_url': 'downloadUrl',
            'archive_name': 'archiveName'
        }

        self._operation_key = None
        self._download_url = None
        self._archive_name = None

    @property
    def operation_key(self):
        """
        **[Required]** Gets the operation_key of this ZipAndDownloadFolderResult.
        Async operation key for zip creation.


        :return: The operation_key of this ZipAndDownloadFolderResult.
        :rtype: str
        """
        return self._operation_key

    @operation_key.setter
    def operation_key(self, operation_key):
        """
        Sets the operation_key of this ZipAndDownloadFolderResult.
        Async operation key for zip creation.


        :param operation_key: The operation_key of this ZipAndDownloadFolderResult.
        :type: str
        """
        self._operation_key = operation_key

    @property
    def download_url(self):
        """
        **[Required]** Gets the download_url of this ZipAndDownloadFolderResult.
        PAR URL for downloading the generated archive after async operation success.


        :return: The download_url of this ZipAndDownloadFolderResult.
        :rtype: str
        """
        return self._download_url

    @download_url.setter
    def download_url(self, download_url):
        """
        Sets the download_url of this ZipAndDownloadFolderResult.
        PAR URL for downloading the generated archive after async operation success.


        :param download_url: The download_url of this ZipAndDownloadFolderResult.
        :type: str
        """
        self._download_url = download_url

    @property
    def archive_name(self):
        """
        **[Required]** Gets the archive_name of this ZipAndDownloadFolderResult.
        Generated archive basename, including its .zip or .aidp extension.


        :return: The archive_name of this ZipAndDownloadFolderResult.
        :rtype: str
        """
        return self._archive_name

    @archive_name.setter
    def archive_name(self, archive_name):
        """
        Sets the archive_name of this ZipAndDownloadFolderResult.
        Generated archive basename, including its .zip or .aidp extension.


        :param archive_name: The archive_name of this ZipAndDownloadFolderResult.
        :type: str
        """
        self._archive_name = archive_name

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other

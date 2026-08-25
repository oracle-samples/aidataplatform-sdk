# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class UploadAndExtractZipResult(object):
    """
    Result of creating or updating a workspace zip upload and extraction operation.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new UploadAndExtractZipResult object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param operation_key:
            The value to assign to the operation_key property of this UploadAndExtractZipResult.
        :type operation_key: str

        :param upload_url:
            The value to assign to the upload_url property of this UploadAndExtractZipResult.
        :type upload_url: str

        :param destination_folder_path:
            The value to assign to the destination_folder_path property of this UploadAndExtractZipResult.
        :type destination_folder_path: str

        """
        self.swagger_types = {
            'operation_key': 'str',
            'upload_url': 'str',
            'destination_folder_path': 'str'
        }

        self.attribute_map = {
            'operation_key': 'operationKey',
            'upload_url': 'uploadUrl',
            'destination_folder_path': 'destinationFolderPath'
        }

        self._operation_key = None
        self._upload_url = None
        self._destination_folder_path = None

    @property
    def operation_key(self):
        """
        **[Required]** Gets the operation_key of this UploadAndExtractZipResult.
        Async operation key for upload and extraction.


        :return: The operation_key of this UploadAndExtractZipResult.
        :rtype: str
        """
        return self._operation_key

    @operation_key.setter
    def operation_key(self, operation_key):
        """
        Sets the operation_key of this UploadAndExtractZipResult.
        Async operation key for upload and extraction.


        :param operation_key: The operation_key of this UploadAndExtractZipResult.
        :type: str
        """
        self._operation_key = operation_key

    @property
    def upload_url(self):
        """
        Gets the upload_url of this UploadAndExtractZipResult.
        PAR URL where the caller uploads the zip bytes. Returned for CREATE.


        :return: The upload_url of this UploadAndExtractZipResult.
        :rtype: str
        """
        return self._upload_url

    @upload_url.setter
    def upload_url(self, upload_url):
        """
        Sets the upload_url of this UploadAndExtractZipResult.
        PAR URL where the caller uploads the zip bytes. Returned for CREATE.


        :param upload_url: The upload_url of this UploadAndExtractZipResult.
        :type: str
        """
        self._upload_url = upload_url

    @property
    def destination_folder_path(self):
        """
        Gets the destination_folder_path of this UploadAndExtractZipResult.
        Final workspace folder path where the zip will be extracted. Returned for CREATE.


        :return: The destination_folder_path of this UploadAndExtractZipResult.
        :rtype: str
        """
        return self._destination_folder_path

    @destination_folder_path.setter
    def destination_folder_path(self, destination_folder_path):
        """
        Sets the destination_folder_path of this UploadAndExtractZipResult.
        Final workspace folder path where the zip will be extracted. Returned for CREATE.


        :param destination_folder_path: The destination_folder_path of this UploadAndExtractZipResult.
        :type: str
        """
        self._destination_folder_path = destination_folder_path

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other

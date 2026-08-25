# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class UploadAndExtractZipDetails(object):
    """
    Details to create or update a workspace zip upload and extraction operation.
    """

    #: A constant which can be used with the action property of a UploadAndExtractZipDetails.
    #: This constant has a value of "CREATE"
    ACTION_CREATE = "CREATE"

    #: A constant which can be used with the action property of a UploadAndExtractZipDetails.
    #: This constant has a value of "UPDATE"
    ACTION_UPDATE = "UPDATE"

    def __init__(self, **kwargs):
        """
        Initializes a new UploadAndExtractZipDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param action:
            The value to assign to the action property of this UploadAndExtractZipDetails.
            Allowed values for this property are: "CREATE", "UPDATE"
        :type action: str

        :param operation_key:
            The value to assign to the operation_key property of this UploadAndExtractZipDetails.
        :type operation_key: str

        :param zip_file_name:
            The value to assign to the zip_file_name property of this UploadAndExtractZipDetails.
        :type zip_file_name: str

        :param destination_folder_path:
            The value to assign to the destination_folder_path property of this UploadAndExtractZipDetails.
        :type destination_folder_path: str

        :param is_overwrite:
            The value to assign to the is_overwrite property of this UploadAndExtractZipDetails.
        :type is_overwrite: bool

        :param e_tag:
            The value to assign to the e_tag property of this UploadAndExtractZipDetails.
        :type e_tag: str

        :param size_in_bytes:
            The value to assign to the size_in_bytes property of this UploadAndExtractZipDetails.
        :type size_in_bytes: int

        """
        self.swagger_types = {
            'action': 'str',
            'operation_key': 'str',
            'zip_file_name': 'str',
            'destination_folder_path': 'str',
            'is_overwrite': 'bool',
            'e_tag': 'str',
            'size_in_bytes': 'int'
        }

        self.attribute_map = {
            'action': 'action',
            'operation_key': 'operationKey',
            'zip_file_name': 'zipFileName',
            'destination_folder_path': 'destinationFolderPath',
            'is_overwrite': 'isOverwrite',
            'e_tag': 'eTag',
            'size_in_bytes': 'sizeInBytes'
        }

        self._action = None
        self._operation_key = None
        self._zip_file_name = None
        self._destination_folder_path = None
        self._is_overwrite = None
        self._e_tag = None
        self._size_in_bytes = None

    @property
    def action(self):
        """
        **[Required]** Gets the action of this UploadAndExtractZipDetails.
        Action to perform for the upload and extract operation. CREATE starts the async operation and returns an upload PAR URL. UPDATE records final uploaded object metadata for an existing operation.

        Allowed values for this property are: "CREATE", "UPDATE"


        :return: The action of this UploadAndExtractZipDetails.
        :rtype: str
        """
        return self._action

    @action.setter
    def action(self, action):
        """
        Sets the action of this UploadAndExtractZipDetails.
        Action to perform for the upload and extract operation. CREATE starts the async operation and returns an upload PAR URL. UPDATE records final uploaded object metadata for an existing operation.


        :param action: The action of this UploadAndExtractZipDetails.
        :type: str
        """
        allowed_values = ["CREATE", "UPDATE"]
        if not value_allowed_none_or_none_sentinel(action, allowed_values):
            raise ValueError(
                "Invalid value for `action`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._action = action

    @property
    def operation_key(self):
        """
        Gets the operation_key of this UploadAndExtractZipDetails.
        Async operation key returned by the CREATE action. Required for UPDATE.


        :return: The operation_key of this UploadAndExtractZipDetails.
        :rtype: str
        """
        return self._operation_key

    @operation_key.setter
    def operation_key(self, operation_key):
        """
        Sets the operation_key of this UploadAndExtractZipDetails.
        Async operation key returned by the CREATE action. Required for UPDATE.


        :param operation_key: The operation_key of this UploadAndExtractZipDetails.
        :type: str
        """
        self._operation_key = operation_key

    @property
    def zip_file_name(self):
        """
        Gets the zip_file_name of this UploadAndExtractZipDetails.
        Name of the zip file that will be uploaded through the returned PAR URL. Required for CREATE.


        :return: The zip_file_name of this UploadAndExtractZipDetails.
        :rtype: str
        """
        return self._zip_file_name

    @zip_file_name.setter
    def zip_file_name(self, zip_file_name):
        """
        Sets the zip_file_name of this UploadAndExtractZipDetails.
        Name of the zip file that will be uploaded through the returned PAR URL. Required for CREATE.


        :param zip_file_name: The zip_file_name of this UploadAndExtractZipDetails.
        :type: str
        """
        self._zip_file_name = zip_file_name

    @property
    def destination_folder_path(self):
        """
        Gets the destination_folder_path of this UploadAndExtractZipDetails.
        Workspace folder where the zip root folder will be extracted. Required for CREATE.


        :return: The destination_folder_path of this UploadAndExtractZipDetails.
        :rtype: str
        """
        return self._destination_folder_path

    @destination_folder_path.setter
    def destination_folder_path(self, destination_folder_path):
        """
        Sets the destination_folder_path of this UploadAndExtractZipDetails.
        Workspace folder where the zip root folder will be extracted. Required for CREATE.


        :param destination_folder_path: The destination_folder_path of this UploadAndExtractZipDetails.
        :type: str
        """
        self._destination_folder_path = destination_folder_path

    @property
    def is_overwrite(self):
        """
        Gets the is_overwrite of this UploadAndExtractZipDetails.
        Flag to overwrite existing files during extraction. If false, existing files are skipped.


        :return: The is_overwrite of this UploadAndExtractZipDetails.
        :rtype: bool
        """
        return self._is_overwrite

    @is_overwrite.setter
    def is_overwrite(self, is_overwrite):
        """
        Sets the is_overwrite of this UploadAndExtractZipDetails.
        Flag to overwrite existing files during extraction. If false, existing files are skipped.


        :param is_overwrite: The is_overwrite of this UploadAndExtractZipDetails.
        :type: bool
        """
        self._is_overwrite = is_overwrite

    @property
    def e_tag(self):
        """
        Gets the e_tag of this UploadAndExtractZipDetails.
        Final Object Storage ETag for the uploaded zip object. If multipart upload is used, the caller commits the multipart upload directly with Object Storage before calling UPDATE.


        :return: The e_tag of this UploadAndExtractZipDetails.
        :rtype: str
        """
        return self._e_tag

    @e_tag.setter
    def e_tag(self, e_tag):
        """
        Sets the e_tag of this UploadAndExtractZipDetails.
        Final Object Storage ETag for the uploaded zip object. If multipart upload is used, the caller commits the multipart upload directly with Object Storage before calling UPDATE.


        :param e_tag: The e_tag of this UploadAndExtractZipDetails.
        :type: str
        """
        self._e_tag = e_tag

    @property
    def size_in_bytes(self):
        """
        Gets the size_in_bytes of this UploadAndExtractZipDetails.
        Final uploaded zip object size in bytes. Required for UPDATE.


        :return: The size_in_bytes of this UploadAndExtractZipDetails.
        :rtype: int
        """
        return self._size_in_bytes

    @size_in_bytes.setter
    def size_in_bytes(self, size_in_bytes):
        """
        Sets the size_in_bytes of this UploadAndExtractZipDetails.
        Final uploaded zip object size in bytes. Required for UPDATE.


        :param size_in_bytes: The size_in_bytes of this UploadAndExtractZipDetails.
        :type: int
        """
        self._size_in_bytes = size_in_bytes

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other

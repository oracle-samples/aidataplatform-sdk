# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class GenerateTempFileUploadTargetResponseDetails(object):
    """
    The details for a generated URI for uploading a temporary file in a schema.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new GenerateTempFileUploadTargetResponseDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param temp_file_upload_target:
            The value to assign to the temp_file_upload_target property of this GenerateTempFileUploadTargetResponseDetails.
        :type temp_file_upload_target: str

        :param upload_key:
            The value to assign to the upload_key property of this GenerateTempFileUploadTargetResponseDetails.
        :type upload_key: str

        :param oci_file_path:
            The value to assign to the oci_file_path property of this GenerateTempFileUploadTargetResponseDetails.
        :type oci_file_path: str

        """
        self.swagger_types = {
            'temp_file_upload_target': 'str',
            'upload_key': 'str',
            'oci_file_path': 'str'
        }

        self.attribute_map = {
            'temp_file_upload_target': 'tempFileUploadTarget',
            'upload_key': 'uploadKey',
            'oci_file_path': 'ociFilePath'
        }

        self._temp_file_upload_target = None
        self._upload_key = None
        self._oci_file_path = None

    @property
    def temp_file_upload_target(self):
        """
        **[Required]** Gets the temp_file_upload_target of this GenerateTempFileUploadTargetResponseDetails.
        The generated target URI to upload the file, it must be prefixed by object stroage URL.


        :return: The temp_file_upload_target of this GenerateTempFileUploadTargetResponseDetails.
        :rtype: str
        """
        return self._temp_file_upload_target

    @temp_file_upload_target.setter
    def temp_file_upload_target(self, temp_file_upload_target):
        """
        Sets the temp_file_upload_target of this GenerateTempFileUploadTargetResponseDetails.
        The generated target URI to upload the file, it must be prefixed by object stroage URL.


        :param temp_file_upload_target: The temp_file_upload_target of this GenerateTempFileUploadTargetResponseDetails.
        :type: str
        """
        self._temp_file_upload_target = temp_file_upload_target

    @property
    def upload_key(self):
        """
        **[Required]** Gets the upload_key of this GenerateTempFileUploadTargetResponseDetails.
        The unique key for this request.


        :return: The upload_key of this GenerateTempFileUploadTargetResponseDetails.
        :rtype: str
        """
        return self._upload_key

    @upload_key.setter
    def upload_key(self, upload_key):
        """
        Sets the upload_key of this GenerateTempFileUploadTargetResponseDetails.
        The unique key for this request.


        :param upload_key: The upload_key of this GenerateTempFileUploadTargetResponseDetails.
        :type: str
        """
        self._upload_key = upload_key

    @property
    def oci_file_path(self):
        """
        **[Required]** Gets the oci_file_path of this GenerateTempFileUploadTargetResponseDetails.
        The exact URI path of the object storage.


        :return: The oci_file_path of this GenerateTempFileUploadTargetResponseDetails.
        :rtype: str
        """
        return self._oci_file_path

    @oci_file_path.setter
    def oci_file_path(self, oci_file_path):
        """
        Sets the oci_file_path of this GenerateTempFileUploadTargetResponseDetails.
        The exact URI path of the object storage.


        :param oci_file_path: The oci_file_path of this GenerateTempFileUploadTargetResponseDetails.
        :type: str
        """
        self._oci_file_path = oci_file_path

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other

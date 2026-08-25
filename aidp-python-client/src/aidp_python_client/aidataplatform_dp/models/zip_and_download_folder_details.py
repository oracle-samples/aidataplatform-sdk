# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ZipAndDownloadFolderDetails(object):
    """
    Details to zip a workspace folder for download.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ZipAndDownloadFolderDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param source_folder_path:
            The value to assign to the source_folder_path property of this ZipAndDownloadFolderDetails.
        :type source_folder_path: str

        """
        self.swagger_types = {
            'source_folder_path': 'str'
        }

        self.attribute_map = {
            'source_folder_path': 'sourceFolderPath'
        }

        self._source_folder_path = None

    @property
    def source_folder_path(self):
        """
        **[Required]** Gets the source_folder_path of this ZipAndDownloadFolderDetails.
        Workspace folder path to zip for download.


        :return: The source_folder_path of this ZipAndDownloadFolderDetails.
        :rtype: str
        """
        return self._source_folder_path

    @source_folder_path.setter
    def source_folder_path(self, source_folder_path):
        """
        Sets the source_folder_path of this ZipAndDownloadFolderDetails.
        Workspace folder path to zip for download.


        :param source_folder_path: The source_folder_path of this ZipAndDownloadFolderDetails.
        :type: str
        """
        self._source_folder_path = source_folder_path

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other

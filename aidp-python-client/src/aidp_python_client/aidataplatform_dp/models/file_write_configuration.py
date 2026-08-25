# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class FileWriteConfiguration(object):
    """
    File write/download settings collected by the UI and persisted as Agent Flow
    session configuration. DataHub stores and forwards these settings;
    runtime and gateway components enforce file policy during execution.
    """

    #: A constant which can be used with the allowed_file_types property of a FileWriteConfiguration.
    #: This constant has a value of "pdf"
    ALLOWED_FILE_TYPES_PDF = "pdf"

    #: A constant which can be used with the allowed_file_types property of a FileWriteConfiguration.
    #: This constant has a value of "txt"
    ALLOWED_FILE_TYPES_TXT = "txt"

    #: A constant which can be used with the allowed_file_types property of a FileWriteConfiguration.
    #: This constant has a value of "csv"
    ALLOWED_FILE_TYPES_CSV = "csv"

    #: A constant which can be used with the allowed_file_types property of a FileWriteConfiguration.
    #: This constant has a value of "json"
    ALLOWED_FILE_TYPES_JSON = "json"

    #: A constant which can be used with the allowed_file_types property of a FileWriteConfiguration.
    #: This constant has a value of "ndjson"
    ALLOWED_FILE_TYPES_NDJSON = "ndjson"

    #: A constant which can be used with the allowed_file_types property of a FileWriteConfiguration.
    #: This constant has a value of "png"
    ALLOWED_FILE_TYPES_PNG = "png"

    #: A constant which can be used with the allowed_file_types property of a FileWriteConfiguration.
    #: This constant has a value of "jpg"
    ALLOWED_FILE_TYPES_JPG = "jpg"

    #: A constant which can be used with the allowed_file_types property of a FileWriteConfiguration.
    #: This constant has a value of "jpeg"
    ALLOWED_FILE_TYPES_JPEG = "jpeg"

    #: A constant which can be used with the visibility property of a FileWriteConfiguration.
    #: This constant has a value of "END_USER_ONLY"
    VISIBILITY_END_USER_ONLY = "END_USER_ONLY"

    #: A constant which can be used with the visibility property of a FileWriteConfiguration.
    #: This constant has a value of "DEVELOPER_ONLY"
    VISIBILITY_DEVELOPER_ONLY = "DEVELOPER_ONLY"

    #: A constant which can be used with the visibility property of a FileWriteConfiguration.
    #: This constant has a value of "END_USER_AND_DEVELOPER"
    VISIBILITY_END_USER_AND_DEVELOPER = "END_USER_AND_DEVELOPER"

    #: A constant which can be used with the download_link_expiry property of a FileWriteConfiguration.
    #: This constant has a value of "SESSION_DURATION"
    DOWNLOAD_LINK_EXPIRY_SESSION_DURATION = "SESSION_DURATION"

    def __init__(self, **kwargs):
        """
        Initializes a new FileWriteConfiguration object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param is_enabled:
            The value to assign to the is_enabled property of this FileWriteConfiguration.
        :type is_enabled: bool

        :param is_download_to_catalog_enabled:
            The value to assign to the is_download_to_catalog_enabled property of this FileWriteConfiguration.
        :type is_download_to_catalog_enabled: bool

        :param allowed_file_types:
            The value to assign to the allowed_file_types property of this FileWriteConfiguration.
            Allowed values for items in this list are: "pdf", "txt", "csv", "json", "ndjson", "png", "jpg", "jpeg", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type allowed_file_types: list[str]

        :param max_file_size_mb:
            The value to assign to the max_file_size_mb property of this FileWriteConfiguration.
        :type max_file_size_mb: int

        :param target_path:
            The value to assign to the target_path property of this FileWriteConfiguration.
        :type target_path: str

        :param is_persistence_enabled:
            The value to assign to the is_persistence_enabled property of this FileWriteConfiguration.
        :type is_persistence_enabled: bool

        :param retention_days:
            The value to assign to the retention_days property of this FileWriteConfiguration.
        :type retention_days: int

        :param visibility:
            The value to assign to the visibility property of this FileWriteConfiguration.
            Allowed values for this property are: "END_USER_ONLY", "DEVELOPER_ONLY", "END_USER_AND_DEVELOPER", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type visibility: str

        :param download_link_expiry:
            The value to assign to the download_link_expiry property of this FileWriteConfiguration.
            Allowed values for this property are: "SESSION_DURATION", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type download_link_expiry: str

        """
        self.swagger_types = {
            'is_enabled': 'bool',
            'is_download_to_catalog_enabled': 'bool',
            'allowed_file_types': 'list[str]',
            'max_file_size_mb': 'int',
            'target_path': 'str',
            'is_persistence_enabled': 'bool',
            'retention_days': 'int',
            'visibility': 'str',
            'download_link_expiry': 'str'
        }

        self.attribute_map = {
            'is_enabled': 'isEnabled',
            'is_download_to_catalog_enabled': 'isDownloadToCatalogEnabled',
            'allowed_file_types': 'allowedFileTypes',
            'max_file_size_mb': 'maxFileSizeMb',
            'target_path': 'targetPath',
            'is_persistence_enabled': 'isPersistenceEnabled',
            'retention_days': 'retentionDays',
            'visibility': 'visibility',
            'download_link_expiry': 'downloadLinkExpiry'
        }

        self._is_enabled = None
        self._is_download_to_catalog_enabled = None
        self._allowed_file_types = None
        self._max_file_size_mb = None
        self._target_path = None
        self._is_persistence_enabled = None
        self._retention_days = None
        self._visibility = None
        self._download_link_expiry = None

    @property
    def is_enabled(self):
        """
        Gets the is_enabled of this FileWriteConfiguration.
        Whether file write/download configuration is enabled.


        :return: The is_enabled of this FileWriteConfiguration.
        :rtype: bool
        """
        return self._is_enabled

    @is_enabled.setter
    def is_enabled(self, is_enabled):
        """
        Sets the is_enabled of this FileWriteConfiguration.
        Whether file write/download configuration is enabled.


        :param is_enabled: The is_enabled of this FileWriteConfiguration.
        :type: bool
        """
        self._is_enabled = is_enabled

    @property
    def is_download_to_catalog_enabled(self):
        """
        Gets the is_download_to_catalog_enabled of this FileWriteConfiguration.
        Whether generated/downloadable files should be written to AIDP Catalog or a configured volume.


        :return: The is_download_to_catalog_enabled of this FileWriteConfiguration.
        :rtype: bool
        """
        return self._is_download_to_catalog_enabled

    @is_download_to_catalog_enabled.setter
    def is_download_to_catalog_enabled(self, is_download_to_catalog_enabled):
        """
        Sets the is_download_to_catalog_enabled of this FileWriteConfiguration.
        Whether generated/downloadable files should be written to AIDP Catalog or a configured volume.


        :param is_download_to_catalog_enabled: The is_download_to_catalog_enabled of this FileWriteConfiguration.
        :type: bool
        """
        self._is_download_to_catalog_enabled = is_download_to_catalog_enabled

    @property
    def allowed_file_types(self):
        """
        Gets the allowed_file_types of this FileWriteConfiguration.
        File type enum values allowed for generated/downloadable files.

        Allowed values for items in this list are: "pdf", "txt", "csv", "json", "ndjson", "png", "jpg", "jpeg", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The allowed_file_types of this FileWriteConfiguration.
        :rtype: list[str]
        """
        return self._allowed_file_types

    @allowed_file_types.setter
    def allowed_file_types(self, allowed_file_types):
        """
        Sets the allowed_file_types of this FileWriteConfiguration.
        File type enum values allowed for generated/downloadable files.


        :param allowed_file_types: The allowed_file_types of this FileWriteConfiguration.
        :type: list[str]
        """
        allowed_values = ["pdf", "txt", "csv", "json", "ndjson", "png", "jpg", "jpeg"]
        if allowed_file_types:
            allowed_file_types[:] = ['UNKNOWN_ENUM_VALUE' if not value_allowed_none_or_none_sentinel(x, allowed_values) else x for x in allowed_file_types]
        self._allowed_file_types = allowed_file_types

    @property
    def max_file_size_mb(self):
        """
        Gets the max_file_size_mb of this FileWriteConfiguration.
        Maximum generated/downloadable file size in megabytes.


        :return: The max_file_size_mb of this FileWriteConfiguration.
        :rtype: int
        """
        return self._max_file_size_mb

    @max_file_size_mb.setter
    def max_file_size_mb(self, max_file_size_mb):
        """
        Sets the max_file_size_mb of this FileWriteConfiguration.
        Maximum generated/downloadable file size in megabytes.


        :param max_file_size_mb: The max_file_size_mb of this FileWriteConfiguration.
        :type: int
        """
        self._max_file_size_mb = max_file_size_mb

    @property
    def target_path(self):
        """
        Gets the target_path of this FileWriteConfiguration.
        Canonical /Volumes/catalog/schema/volume path, optionally followed by safe folder segments, or a legacy relative volumeRef/workspaceFolder path where generated/downloadable files should be stored for retention or delivery.


        :return: The target_path of this FileWriteConfiguration.
        :rtype: str
        """
        return self._target_path

    @target_path.setter
    def target_path(self, target_path):
        """
        Sets the target_path of this FileWriteConfiguration.
        Canonical /Volumes/catalog/schema/volume path, optionally followed by safe folder segments, or a legacy relative volumeRef/workspaceFolder path where generated/downloadable files should be stored for retention or delivery.


        :param target_path: The target_path of this FileWriteConfiguration.
        :type: str
        """
        self._target_path = target_path

    @property
    def is_persistence_enabled(self):
        """
        Gets the is_persistence_enabled of this FileWriteConfiguration.
        Whether generated/downloadable files should be retained beyond the current request/session intent.


        :return: The is_persistence_enabled of this FileWriteConfiguration.
        :rtype: bool
        """
        return self._is_persistence_enabled

    @is_persistence_enabled.setter
    def is_persistence_enabled(self, is_persistence_enabled):
        """
        Sets the is_persistence_enabled of this FileWriteConfiguration.
        Whether generated/downloadable files should be retained beyond the current request/session intent.


        :param is_persistence_enabled: The is_persistence_enabled of this FileWriteConfiguration.
        :type: bool
        """
        self._is_persistence_enabled = is_persistence_enabled

    @property
    def retention_days(self):
        """
        Gets the retention_days of this FileWriteConfiguration.
        Retention period in days for generated/downloadable files.


        :return: The retention_days of this FileWriteConfiguration.
        :rtype: int
        """
        return self._retention_days

    @retention_days.setter
    def retention_days(self, retention_days):
        """
        Sets the retention_days of this FileWriteConfiguration.
        Retention period in days for generated/downloadable files.


        :param retention_days: The retention_days of this FileWriteConfiguration.
        :type: int
        """
        self._retention_days = retention_days

    @property
    def visibility(self):
        """
        Gets the visibility of this FileWriteConfiguration.
        Intended file visibility for generated/downloadable files.

        Allowed values for this property are: "END_USER_ONLY", "DEVELOPER_ONLY", "END_USER_AND_DEVELOPER", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The visibility of this FileWriteConfiguration.
        :rtype: str
        """
        return self._visibility

    @visibility.setter
    def visibility(self, visibility):
        """
        Sets the visibility of this FileWriteConfiguration.
        Intended file visibility for generated/downloadable files.


        :param visibility: The visibility of this FileWriteConfiguration.
        :type: str
        """
        allowed_values = ["END_USER_ONLY", "DEVELOPER_ONLY", "END_USER_AND_DEVELOPER"]
        if not value_allowed_none_or_none_sentinel(visibility, allowed_values):
            visibility = 'UNKNOWN_ENUM_VALUE'
        self._visibility = visibility

    @property
    def download_link_expiry(self):
        """
        Gets the download_link_expiry of this FileWriteConfiguration.
        Intended download link expiry behavior, for example session duration.

        Allowed values for this property are: "SESSION_DURATION", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The download_link_expiry of this FileWriteConfiguration.
        :rtype: str
        """
        return self._download_link_expiry

    @download_link_expiry.setter
    def download_link_expiry(self, download_link_expiry):
        """
        Sets the download_link_expiry of this FileWriteConfiguration.
        Intended download link expiry behavior, for example session duration.


        :param download_link_expiry: The download_link_expiry of this FileWriteConfiguration.
        :type: str
        """
        allowed_values = ["SESSION_DURATION"]
        if not value_allowed_none_or_none_sentinel(download_link_expiry, allowed_values):
            download_link_expiry = 'UNKNOWN_ENUM_VALUE'
        self._download_link_expiry = download_link_expiry

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other

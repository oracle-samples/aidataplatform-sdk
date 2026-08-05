# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class FileReadConfiguration(object):
    """
    File read/upload settings collected by the UI and persisted as Agent Flow
    session configuration. DataHub stores and forwards these settings;
    runtime and gateway components enforce file policy during execution.
    """

    #: A constant which can be used with the allowed_file_types property of a FileReadConfiguration.
    #: This constant has a value of "pdf"
    ALLOWED_FILE_TYPES_PDF = "pdf"

    #: A constant which can be used with the allowed_file_types property of a FileReadConfiguration.
    #: This constant has a value of "txt"
    ALLOWED_FILE_TYPES_TXT = "txt"

    #: A constant which can be used with the allowed_file_types property of a FileReadConfiguration.
    #: This constant has a value of "csv"
    ALLOWED_FILE_TYPES_CSV = "csv"

    #: A constant which can be used with the allowed_file_types property of a FileReadConfiguration.
    #: This constant has a value of "json"
    ALLOWED_FILE_TYPES_JSON = "json"

    #: A constant which can be used with the allowed_file_types property of a FileReadConfiguration.
    #: This constant has a value of "ndjson"
    ALLOWED_FILE_TYPES_NDJSON = "ndjson"

    #: A constant which can be used with the allowed_file_types property of a FileReadConfiguration.
    #: This constant has a value of "png"
    ALLOWED_FILE_TYPES_PNG = "png"

    #: A constant which can be used with the allowed_file_types property of a FileReadConfiguration.
    #: This constant has a value of "jpg"
    ALLOWED_FILE_TYPES_JPG = "jpg"

    #: A constant which can be used with the allowed_file_types property of a FileReadConfiguration.
    #: This constant has a value of "jpeg"
    ALLOWED_FILE_TYPES_JPEG = "jpeg"

    def __init__(self, **kwargs):
        """
        Initializes a new FileReadConfiguration object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param is_enabled:
            The value to assign to the is_enabled property of this FileReadConfiguration.
        :type is_enabled: bool

        :param allowed_file_types:
            The value to assign to the allowed_file_types property of this FileReadConfiguration.
            Allowed values for items in this list are: "pdf", "txt", "csv", "json", "ndjson", "png", "jpg", "jpeg", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type allowed_file_types: list[str]

        :param max_file_size_mb:
            The value to assign to the max_file_size_mb property of this FileReadConfiguration.
        :type max_file_size_mb: int

        :param max_file_count:
            The value to assign to the max_file_count property of this FileReadConfiguration.
        :type max_file_count: int

        :param target_path:
            The value to assign to the target_path property of this FileReadConfiguration.
        :type target_path: str

        :param is_persistence_enabled:
            The value to assign to the is_persistence_enabled property of this FileReadConfiguration.
        :type is_persistence_enabled: bool

        :param retention_days:
            The value to assign to the retention_days property of this FileReadConfiguration.
        :type retention_days: int

        """
        self.swagger_types = {
            'is_enabled': 'bool',
            'allowed_file_types': 'list[str]',
            'max_file_size_mb': 'int',
            'max_file_count': 'int',
            'target_path': 'str',
            'is_persistence_enabled': 'bool',
            'retention_days': 'int'
        }

        self.attribute_map = {
            'is_enabled': 'isEnabled',
            'allowed_file_types': 'allowedFileTypes',
            'max_file_size_mb': 'maxFileSizeMb',
            'max_file_count': 'maxFileCount',
            'target_path': 'targetPath',
            'is_persistence_enabled': 'isPersistenceEnabled',
            'retention_days': 'retentionDays'
        }

        self._is_enabled = None
        self._allowed_file_types = None
        self._max_file_size_mb = None
        self._max_file_count = None
        self._target_path = None
        self._is_persistence_enabled = None
        self._retention_days = None

    @property
    def is_enabled(self):
        """
        Gets the is_enabled of this FileReadConfiguration.
        Whether file read/upload configuration is enabled.


        :return: The is_enabled of this FileReadConfiguration.
        :rtype: bool
        """
        return self._is_enabled

    @is_enabled.setter
    def is_enabled(self, is_enabled):
        """
        Sets the is_enabled of this FileReadConfiguration.
        Whether file read/upload configuration is enabled.


        :param is_enabled: The is_enabled of this FileReadConfiguration.
        :type: bool
        """
        self._is_enabled = is_enabled

    @property
    def allowed_file_types(self):
        """
        Gets the allowed_file_types of this FileReadConfiguration.
        File type enum values accepted by the UI/runtime contract.

        Allowed values for items in this list are: "pdf", "txt", "csv", "json", "ndjson", "png", "jpg", "jpeg", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The allowed_file_types of this FileReadConfiguration.
        :rtype: list[str]
        """
        return self._allowed_file_types

    @allowed_file_types.setter
    def allowed_file_types(self, allowed_file_types):
        """
        Sets the allowed_file_types of this FileReadConfiguration.
        File type enum values accepted by the UI/runtime contract.


        :param allowed_file_types: The allowed_file_types of this FileReadConfiguration.
        :type: list[str]
        """
        allowed_values = ["pdf", "txt", "csv", "json", "ndjson", "png", "jpg", "jpeg"]
        if allowed_file_types:
            allowed_file_types[:] = ['UNKNOWN_ENUM_VALUE' if not value_allowed_none_or_none_sentinel(x, allowed_values) else x for x in allowed_file_types]
        self._allowed_file_types = allowed_file_types

    @property
    def max_file_size_mb(self):
        """
        Gets the max_file_size_mb of this FileReadConfiguration.
        Maximum uploaded file size in megabytes.


        :return: The max_file_size_mb of this FileReadConfiguration.
        :rtype: int
        """
        return self._max_file_size_mb

    @max_file_size_mb.setter
    def max_file_size_mb(self, max_file_size_mb):
        """
        Sets the max_file_size_mb of this FileReadConfiguration.
        Maximum uploaded file size in megabytes.


        :param max_file_size_mb: The max_file_size_mb of this FileReadConfiguration.
        :type: int
        """
        self._max_file_size_mb = max_file_size_mb

    @property
    def max_file_count(self):
        """
        Gets the max_file_count of this FileReadConfiguration.
        Maximum number of files allowed in a request/session.


        :return: The max_file_count of this FileReadConfiguration.
        :rtype: int
        """
        return self._max_file_count

    @max_file_count.setter
    def max_file_count(self, max_file_count):
        """
        Sets the max_file_count of this FileReadConfiguration.
        Maximum number of files allowed in a request/session.


        :param max_file_count: The max_file_count of this FileReadConfiguration.
        :type: int
        """
        self._max_file_count = max_file_count

    @property
    def target_path(self):
        """
        Gets the target_path of this FileReadConfiguration.
        Strict relative workspace folder or volumeRef/workspaceFolder path where uploaded/readable files are stored or located for later runtime access. Path segments must not be empty, absolute, traversal segments, backslash-separated, contain control characters, or contain malformed dot-separated volume refs.


        :return: The target_path of this FileReadConfiguration.
        :rtype: str
        """
        return self._target_path

    @target_path.setter
    def target_path(self, target_path):
        """
        Sets the target_path of this FileReadConfiguration.
        Strict relative workspace folder or volumeRef/workspaceFolder path where uploaded/readable files are stored or located for later runtime access. Path segments must not be empty, absolute, traversal segments, backslash-separated, contain control characters, or contain malformed dot-separated volume refs.


        :param target_path: The target_path of this FileReadConfiguration.
        :type: str
        """
        self._target_path = target_path

    @property
    def is_persistence_enabled(self):
        """
        Gets the is_persistence_enabled of this FileReadConfiguration.
        Whether uploaded files should be retained beyond the current request/session intent.


        :return: The is_persistence_enabled of this FileReadConfiguration.
        :rtype: bool
        """
        return self._is_persistence_enabled

    @is_persistence_enabled.setter
    def is_persistence_enabled(self, is_persistence_enabled):
        """
        Sets the is_persistence_enabled of this FileReadConfiguration.
        Whether uploaded files should be retained beyond the current request/session intent.


        :param is_persistence_enabled: The is_persistence_enabled of this FileReadConfiguration.
        :type: bool
        """
        self._is_persistence_enabled = is_persistence_enabled

    @property
    def retention_days(self):
        """
        Gets the retention_days of this FileReadConfiguration.
        Retention period in days for persisted files.


        :return: The retention_days of this FileReadConfiguration.
        :rtype: int
        """
        return self._retention_days

    @retention_days.setter
    def retention_days(self, retention_days):
        """
        Sets the retention_days of this FileReadConfiguration.
        Retention period in days for persisted files.


        :param retention_days: The retention_days of this FileReadConfiguration.
        :type: int
        """
        self._retention_days = retention_days

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other

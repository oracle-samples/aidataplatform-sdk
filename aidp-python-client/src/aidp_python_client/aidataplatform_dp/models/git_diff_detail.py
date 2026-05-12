# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class GitDiffDetail(object):
    """
    Unified diff details for a git file.
    """

    #: A constant which can be used with the truncated_reason property of a GitDiffDetail.
    #: This constant has a value of "MAX_PATCH_BYTES"
    TRUNCATED_REASON_MAX_PATCH_BYTES = "MAX_PATCH_BYTES"

    #: A constant which can be used with the truncated_reason property of a GitDiffDetail.
    #: This constant has a value of "BINARY"
    TRUNCATED_REASON_BINARY = "BINARY"

    #: A constant which can be used with the truncated_reason property of a GitDiffDetail.
    #: This constant has a value of "TOO_LARGE"
    TRUNCATED_REASON_TOO_LARGE = "TOO_LARGE"

    #: A constant which can be used with the truncated_reason property of a GitDiffDetail.
    #: This constant has a value of "UNKNOWN"
    TRUNCATED_REASON_UNKNOWN = "UNKNOWN"

    def __init__(self, **kwargs):
        """
        Initializes a new GitDiffDetail object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param git_file_path:
            The value to assign to the git_file_path property of this GitDiffDetail.
        :type git_file_path: str

        :param is_conflict:
            The value to assign to the is_conflict property of this GitDiffDetail.
        :type is_conflict: bool

        :param is_binary:
            The value to assign to the is_binary property of this GitDiffDetail.
        :type is_binary: bool

        :param patch:
            The value to assign to the patch property of this GitDiffDetail.
        :type patch: str

        :param is_truncated:
            The value to assign to the is_truncated property of this GitDiffDetail.
        :type is_truncated: bool

        :param truncated_reason:
            The value to assign to the truncated_reason property of this GitDiffDetail.
            Allowed values for this property are: "MAX_PATCH_BYTES", "BINARY", "TOO_LARGE", "UNKNOWN", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type truncated_reason: str

        """
        self.swagger_types = {
            'git_file_path': 'str',
            'is_conflict': 'bool',
            'is_binary': 'bool',
            'patch': 'str',
            'is_truncated': 'bool',
            'truncated_reason': 'str'
        }

        self.attribute_map = {
            'git_file_path': 'gitFilePath',
            'is_conflict': 'isConflict',
            'is_binary': 'isBinary',
            'patch': 'patch',
            'is_truncated': 'isTruncated',
            'truncated_reason': 'truncatedReason'
        }

        self._git_file_path = None
        self._is_conflict = None
        self._is_binary = None
        self._patch = None
        self._is_truncated = None
        self._truncated_reason = None

    @property
    def git_file_path(self):
        """
        **[Required]** Gets the git_file_path of this GitDiffDetail.
        File path relative to repository root.


        :return: The git_file_path of this GitDiffDetail.
        :rtype: str
        """
        return self._git_file_path

    @git_file_path.setter
    def git_file_path(self, git_file_path):
        """
        Sets the git_file_path of this GitDiffDetail.
        File path relative to repository root.


        :param git_file_path: The git_file_path of this GitDiffDetail.
        :type: str
        """
        self._git_file_path = git_file_path

    @property
    def is_conflict(self):
        """
        Gets the is_conflict of this GitDiffDetail.
        Indicates whether the file is currently in a conflicted state.


        :return: The is_conflict of this GitDiffDetail.
        :rtype: bool
        """
        return self._is_conflict

    @is_conflict.setter
    def is_conflict(self, is_conflict):
        """
        Sets the is_conflict of this GitDiffDetail.
        Indicates whether the file is currently in a conflicted state.


        :param is_conflict: The is_conflict of this GitDiffDetail.
        :type: bool
        """
        self._is_conflict = is_conflict

    @property
    def is_binary(self):
        """
        Gets the is_binary of this GitDiffDetail.
        Indicates whether the file is binary.


        :return: The is_binary of this GitDiffDetail.
        :rtype: bool
        """
        return self._is_binary

    @is_binary.setter
    def is_binary(self, is_binary):
        """
        Sets the is_binary of this GitDiffDetail.
        Indicates whether the file is binary.


        :param is_binary: The is_binary of this GitDiffDetail.
        :type: bool
        """
        self._is_binary = is_binary

    @property
    def patch(self):
        """
        Gets the patch of this GitDiffDetail.
        Unified diff patch text.


        :return: The patch of this GitDiffDetail.
        :rtype: str
        """
        return self._patch

    @patch.setter
    def patch(self, patch):
        """
        Sets the patch of this GitDiffDetail.
        Unified diff patch text.


        :param patch: The patch of this GitDiffDetail.
        :type: str
        """
        self._patch = patch

    @property
    def is_truncated(self):
        """
        Gets the is_truncated of this GitDiffDetail.
        Indicates whether the diff output was truncated.


        :return: The is_truncated of this GitDiffDetail.
        :rtype: bool
        """
        return self._is_truncated

    @is_truncated.setter
    def is_truncated(self, is_truncated):
        """
        Sets the is_truncated of this GitDiffDetail.
        Indicates whether the diff output was truncated.


        :param is_truncated: The is_truncated of this GitDiffDetail.
        :type: bool
        """
        self._is_truncated = is_truncated

    @property
    def truncated_reason(self):
        """
        Gets the truncated_reason of this GitDiffDetail.
        Indicates the reason for the truncated diff to be returned.

        Allowed values for this property are: "MAX_PATCH_BYTES", "BINARY", "TOO_LARGE", "UNKNOWN", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The truncated_reason of this GitDiffDetail.
        :rtype: str
        """
        return self._truncated_reason

    @truncated_reason.setter
    def truncated_reason(self, truncated_reason):
        """
        Sets the truncated_reason of this GitDiffDetail.
        Indicates the reason for the truncated diff to be returned.


        :param truncated_reason: The truncated_reason of this GitDiffDetail.
        :type: str
        """
        allowed_values = ["MAX_PATCH_BYTES", "BINARY", "TOO_LARGE", "UNKNOWN"]
        if not value_allowed_none_or_none_sentinel(truncated_reason, allowed_values):
            truncated_reason = 'UNKNOWN_ENUM_VALUE'
        self._truncated_reason = truncated_reason

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other

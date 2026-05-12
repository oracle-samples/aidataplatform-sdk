# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class GitDiffSummary(object):
    """
    Summary information about a file that differs in a git folder context.
    """

    #: A constant which can be used with the change_type property of a GitDiffSummary.
    #: This constant has a value of "ADDED"
    CHANGE_TYPE_ADDED = "ADDED"

    #: A constant which can be used with the change_type property of a GitDiffSummary.
    #: This constant has a value of "MODIFIED"
    CHANGE_TYPE_MODIFIED = "MODIFIED"

    #: A constant which can be used with the change_type property of a GitDiffSummary.
    #: This constant has a value of "DELETED"
    CHANGE_TYPE_DELETED = "DELETED"

    #: A constant which can be used with the change_type property of a GitDiffSummary.
    #: This constant has a value of "RENAMED"
    CHANGE_TYPE_RENAMED = "RENAMED"

    #: A constant which can be used with the change_type property of a GitDiffSummary.
    #: This constant has a value of "COPIED"
    CHANGE_TYPE_COPIED = "COPIED"

    #: A constant which can be used with the change_type property of a GitDiffSummary.
    #: This constant has a value of "TYPE_CHANGED"
    CHANGE_TYPE_TYPE_CHANGED = "TYPE_CHANGED"

    #: A constant which can be used with the change_type property of a GitDiffSummary.
    #: This constant has a value of "UNMERGED"
    CHANGE_TYPE_UNMERGED = "UNMERGED"

    #: A constant which can be used with the conflict_type property of a GitDiffSummary.
    #: This constant has a value of "BOTH_MODIFIED"
    CONFLICT_TYPE_BOTH_MODIFIED = "BOTH_MODIFIED"

    #: A constant which can be used with the conflict_type property of a GitDiffSummary.
    #: This constant has a value of "BOTH_ADDED"
    CONFLICT_TYPE_BOTH_ADDED = "BOTH_ADDED"

    #: A constant which can be used with the conflict_type property of a GitDiffSummary.
    #: This constant has a value of "BOTH_DELETED"
    CONFLICT_TYPE_BOTH_DELETED = "BOTH_DELETED"

    #: A constant which can be used with the conflict_type property of a GitDiffSummary.
    #: This constant has a value of "ADDED_BY_US"
    CONFLICT_TYPE_ADDED_BY_US = "ADDED_BY_US"

    #: A constant which can be used with the conflict_type property of a GitDiffSummary.
    #: This constant has a value of "ADDED_BY_THEM"
    CONFLICT_TYPE_ADDED_BY_THEM = "ADDED_BY_THEM"

    #: A constant which can be used with the conflict_type property of a GitDiffSummary.
    #: This constant has a value of "DELETED_BY_US"
    CONFLICT_TYPE_DELETED_BY_US = "DELETED_BY_US"

    #: A constant which can be used with the conflict_type property of a GitDiffSummary.
    #: This constant has a value of "DELETED_BY_THEM"
    CONFLICT_TYPE_DELETED_BY_THEM = "DELETED_BY_THEM"

    #: A constant which can be used with the conflict_type property of a GitDiffSummary.
    #: This constant has a value of "UNKNOWN"
    CONFLICT_TYPE_UNKNOWN = "UNKNOWN"

    def __init__(self, **kwargs):
        """
        Initializes a new GitDiffSummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param git_file_path:
            The value to assign to the git_file_path property of this GitDiffSummary.
        :type git_file_path: str

        :param change_type:
            The value to assign to the change_type property of this GitDiffSummary.
            Allowed values for this property are: "ADDED", "MODIFIED", "DELETED", "RENAMED", "COPIED", "TYPE_CHANGED", "UNMERGED", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type change_type: str

        :param old_git_file_path:
            The value to assign to the old_git_file_path property of this GitDiffSummary.
        :type old_git_file_path: str

        :param is_conflict:
            The value to assign to the is_conflict property of this GitDiffSummary.
        :type is_conflict: bool

        :param conflict_type:
            The value to assign to the conflict_type property of this GitDiffSummary.
            Allowed values for this property are: "BOTH_MODIFIED", "BOTH_ADDED", "BOTH_DELETED", "ADDED_BY_US", "ADDED_BY_THEM", "DELETED_BY_US", "DELETED_BY_THEM", "UNKNOWN", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type conflict_type: str

        """
        self.swagger_types = {
            'git_file_path': 'str',
            'change_type': 'str',
            'old_git_file_path': 'str',
            'is_conflict': 'bool',
            'conflict_type': 'str'
        }

        self.attribute_map = {
            'git_file_path': 'gitFilePath',
            'change_type': 'changeType',
            'old_git_file_path': 'oldGitFilePath',
            'is_conflict': 'isConflict',
            'conflict_type': 'conflictType'
        }

        self._git_file_path = None
        self._change_type = None
        self._old_git_file_path = None
        self._is_conflict = None
        self._conflict_type = None

    @property
    def git_file_path(self):
        """
        **[Required]** Gets the git_file_path of this GitDiffSummary.
        File path relative to repository root.


        :return: The git_file_path of this GitDiffSummary.
        :rtype: str
        """
        return self._git_file_path

    @git_file_path.setter
    def git_file_path(self, git_file_path):
        """
        Sets the git_file_path of this GitDiffSummary.
        File path relative to repository root.


        :param git_file_path: The git_file_path of this GitDiffSummary.
        :type: str
        """
        self._git_file_path = git_file_path

    @property
    def change_type(self):
        """
        **[Required]** Gets the change_type of this GitDiffSummary.
        Type of change for this file.

        Allowed values for this property are: "ADDED", "MODIFIED", "DELETED", "RENAMED", "COPIED", "TYPE_CHANGED", "UNMERGED", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The change_type of this GitDiffSummary.
        :rtype: str
        """
        return self._change_type

    @change_type.setter
    def change_type(self, change_type):
        """
        Sets the change_type of this GitDiffSummary.
        Type of change for this file.


        :param change_type: The change_type of this GitDiffSummary.
        :type: str
        """
        allowed_values = ["ADDED", "MODIFIED", "DELETED", "RENAMED", "COPIED", "TYPE_CHANGED", "UNMERGED"]
        if not value_allowed_none_or_none_sentinel(change_type, allowed_values):
            change_type = 'UNKNOWN_ENUM_VALUE'
        self._change_type = change_type

    @property
    def old_git_file_path(self):
        """
        Gets the old_git_file_path of this GitDiffSummary.
        Previous path if the file was renamed.


        :return: The old_git_file_path of this GitDiffSummary.
        :rtype: str
        """
        return self._old_git_file_path

    @old_git_file_path.setter
    def old_git_file_path(self, old_git_file_path):
        """
        Sets the old_git_file_path of this GitDiffSummary.
        Previous path if the file was renamed.


        :param old_git_file_path: The old_git_file_path of this GitDiffSummary.
        :type: str
        """
        self._old_git_file_path = old_git_file_path

    @property
    def is_conflict(self):
        """
        **[Required]** Gets the is_conflict of this GitDiffSummary.
        Whether the file is currently in an unmerged/conflicted state.


        :return: The is_conflict of this GitDiffSummary.
        :rtype: bool
        """
        return self._is_conflict

    @is_conflict.setter
    def is_conflict(self, is_conflict):
        """
        Sets the is_conflict of this GitDiffSummary.
        Whether the file is currently in an unmerged/conflicted state.


        :param is_conflict: The is_conflict of this GitDiffSummary.
        :type: bool
        """
        self._is_conflict = is_conflict

    @property
    def conflict_type(self):
        """
        Gets the conflict_type of this GitDiffSummary.
        Conflict classification when isConflict is true.

        Allowed values for this property are: "BOTH_MODIFIED", "BOTH_ADDED", "BOTH_DELETED", "ADDED_BY_US", "ADDED_BY_THEM", "DELETED_BY_US", "DELETED_BY_THEM", "UNKNOWN", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The conflict_type of this GitDiffSummary.
        :rtype: str
        """
        return self._conflict_type

    @conflict_type.setter
    def conflict_type(self, conflict_type):
        """
        Sets the conflict_type of this GitDiffSummary.
        Conflict classification when isConflict is true.


        :param conflict_type: The conflict_type of this GitDiffSummary.
        :type: str
        """
        allowed_values = ["BOTH_MODIFIED", "BOTH_ADDED", "BOTH_DELETED", "ADDED_BY_US", "ADDED_BY_THEM", "DELETED_BY_US", "DELETED_BY_THEM", "UNKNOWN"]
        if not value_allowed_none_or_none_sentinel(conflict_type, allowed_values):
            conflict_type = 'UNKNOWN_ENUM_VALUE'
        self._conflict_type = conflict_type

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other

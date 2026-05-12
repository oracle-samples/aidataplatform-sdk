# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ResetGitFolderStateDetails(object):
    """
    Action to either abort an in-progress merge/rebase or discard all local changes.
    """

    #: A constant which can be used with the action property of a ResetGitFolderStateDetails.
    #: This constant has a value of "ABORT_MERGE"
    ACTION_ABORT_MERGE = "ABORT_MERGE"

    #: A constant which can be used with the action property of a ResetGitFolderStateDetails.
    #: This constant has a value of "ABORT_REBASE"
    ACTION_ABORT_REBASE = "ABORT_REBASE"

    #: A constant which can be used with the action property of a ResetGitFolderStateDetails.
    #: This constant has a value of "ABORT_PULL"
    ACTION_ABORT_PULL = "ABORT_PULL"

    #: A constant which can be used with the action property of a ResetGitFolderStateDetails.
    #: This constant has a value of "DISCARD"
    ACTION_DISCARD = "DISCARD"

    def __init__(self, **kwargs):
        """
        Initializes a new ResetGitFolderStateDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param action:
            The value to assign to the action property of this ResetGitFolderStateDetails.
            Allowed values for this property are: "ABORT_MERGE", "ABORT_REBASE", "ABORT_PULL", "DISCARD"
        :type action: str

        :param discard_paths:
            The value to assign to the discard_paths property of this ResetGitFolderStateDetails.
        :type discard_paths: list[str]

        :param can_include_ignored:
            The value to assign to the can_include_ignored property of this ResetGitFolderStateDetails.
        :type can_include_ignored: bool

        """
        self.swagger_types = {
            'action': 'str',
            'discard_paths': 'list[str]',
            'can_include_ignored': 'bool'
        }

        self.attribute_map = {
            'action': 'action',
            'discard_paths': 'discardPaths',
            'can_include_ignored': 'canIncludeIgnored'
        }

        self._action = None
        self._discard_paths = None
        self._can_include_ignored = None

    @property
    def action(self):
        """
        **[Required]** Gets the action of this ResetGitFolderStateDetails.
        The action to perform.

        Allowed values for this property are: "ABORT_MERGE", "ABORT_REBASE", "ABORT_PULL", "DISCARD"


        :return: The action of this ResetGitFolderStateDetails.
        :rtype: str
        """
        return self._action

    @action.setter
    def action(self, action):
        """
        Sets the action of this ResetGitFolderStateDetails.
        The action to perform.


        :param action: The action of this ResetGitFolderStateDetails.
        :type: str
        """
        allowed_values = ["ABORT_MERGE", "ABORT_REBASE", "ABORT_PULL", "DISCARD"]
        if not value_allowed_none_or_none_sentinel(action, allowed_values):
            raise ValueError(
                "Invalid value for `action`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._action = action

    @property
    def discard_paths(self):
        """
        Gets the discard_paths of this ResetGitFolderStateDetails.
        list of file paths whose changes are to be discarded and reset to original


        :return: The discard_paths of this ResetGitFolderStateDetails.
        :rtype: list[str]
        """
        return self._discard_paths

    @discard_paths.setter
    def discard_paths(self, discard_paths):
        """
        Sets the discard_paths of this ResetGitFolderStateDetails.
        list of file paths whose changes are to be discarded and reset to original


        :param discard_paths: The discard_paths of this ResetGitFolderStateDetails.
        :type: list[str]
        """
        self._discard_paths = discard_paths

    @property
    def can_include_ignored(self):
        """
        Gets the can_include_ignored of this ResetGitFolderStateDetails.
        If true with DISCARD, also remove ignored files (-x).


        :return: The can_include_ignored of this ResetGitFolderStateDetails.
        :rtype: bool
        """
        return self._can_include_ignored

    @can_include_ignored.setter
    def can_include_ignored(self, can_include_ignored):
        """
        Sets the can_include_ignored of this ResetGitFolderStateDetails.
        If true with DISCARD, also remove ignored files (-x).


        :param can_include_ignored: The can_include_ignored of this ResetGitFolderStateDetails.
        :type: bool
        """
        self._can_include_ignored = can_include_ignored

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other

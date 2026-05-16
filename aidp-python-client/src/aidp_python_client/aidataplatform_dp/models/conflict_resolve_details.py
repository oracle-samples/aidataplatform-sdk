# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ConflictResolveDetails(object):
    """
    List of files to checkout side or mark as resolved
    """

    #: A constant which can be used with the action property of a ConflictResolveDetails.
    #: This constant has a value of "LOCAL"
    ACTION_LOCAL = "LOCAL"

    #: A constant which can be used with the action property of a ConflictResolveDetails.
    #: This constant has a value of "REMOTE"
    ACTION_REMOTE = "REMOTE"

    #: A constant which can be used with the action property of a ConflictResolveDetails.
    #: This constant has a value of "MARK_RESOLVED"
    ACTION_MARK_RESOLVED = "MARK_RESOLVED"

    def __init__(self, **kwargs):
        """
        Initializes a new ConflictResolveDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param files:
            The value to assign to the files property of this ConflictResolveDetails.
        :type files: list[str]

        :param action:
            The value to assign to the action property of this ConflictResolveDetails.
            Allowed values for this property are: "LOCAL", "REMOTE", "MARK_RESOLVED"
        :type action: str

        """
        self.swagger_types = {
            'files': 'list[str]',
            'action': 'str'
        }

        self.attribute_map = {
            'files': 'files',
            'action': 'action'
        }

        self._files = None
        self._action = None

    @property
    def files(self):
        """
        **[Required]** Gets the files of this ConflictResolveDetails.
        list of file paths to checkout side or mark as resolved


        :return: The files of this ConflictResolveDetails.
        :rtype: list[str]
        """
        return self._files

    @files.setter
    def files(self, files):
        """
        Sets the files of this ConflictResolveDetails.
        list of file paths to checkout side or mark as resolved


        :param files: The files of this ConflictResolveDetails.
        :type: list[str]
        """
        self._files = files

    @property
    def action(self):
        """
        **[Required]** Gets the action of this ConflictResolveDetails.
        Action for resolving conflict

        Allowed values for this property are: "LOCAL", "REMOTE", "MARK_RESOLVED"


        :return: The action of this ConflictResolveDetails.
        :rtype: str
        """
        return self._action

    @action.setter
    def action(self, action):
        """
        Sets the action of this ConflictResolveDetails.
        Action for resolving conflict


        :param action: The action of this ConflictResolveDetails.
        :type: str
        """
        allowed_values = ["LOCAL", "REMOTE", "MARK_RESOLVED"]
        if not value_allowed_none_or_none_sentinel(action, allowed_values):
            raise ValueError(
                "Invalid value for `action`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._action = action

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other

# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class GitOperationState(object):
    """
    Current git operation state for a repository folder context.
    """

    #: A constant which can be used with the state property of a GitOperationState.
    #: This constant has a value of "CLEAN"
    STATE_CLEAN = "CLEAN"

    #: A constant which can be used with the state property of a GitOperationState.
    #: This constant has a value of "MERGE_IN_PROGRESS"
    STATE_MERGE_IN_PROGRESS = "MERGE_IN_PROGRESS"

    #: A constant which can be used with the state property of a GitOperationState.
    #: This constant has a value of "REBASE_IN_PROGRESS"
    STATE_REBASE_IN_PROGRESS = "REBASE_IN_PROGRESS"

    #: A constant which can be used with the state property of a GitOperationState.
    #: This constant has a value of "PULL_IN_PROGRESS"
    STATE_PULL_IN_PROGRESS = "PULL_IN_PROGRESS"

    #: A constant which can be used with the state property of a GitOperationState.
    #: This constant has a value of "DETACHED_HEAD"
    STATE_DETACHED_HEAD = "DETACHED_HEAD"

    #: A constant which can be used with the state property of a GitOperationState.
    #: This constant has a value of "UNKNOWN"
    STATE_UNKNOWN = "UNKNOWN"

    def __init__(self, **kwargs):
        """
        Initializes a new GitOperationState object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param git_folder_path:
            The value to assign to the git_folder_path property of this GitOperationState.
        :type git_folder_path: str

        :param state:
            The value to assign to the state property of this GitOperationState.
            Allowed values for this property are: "CLEAN", "MERGE_IN_PROGRESS", "REBASE_IN_PROGRESS", "PULL_IN_PROGRESS", "DETACHED_HEAD", "UNKNOWN", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type state: str

        :param is_blocking:
            The value to assign to the is_blocking property of this GitOperationState.
        :type is_blocking: bool

        :param is_allowed:
            The value to assign to the is_allowed property of this GitOperationState.
        :type is_allowed: bool

        :param message:
            The value to assign to the message property of this GitOperationState.
        :type message: str

        :param current_branch:
            The value to assign to the current_branch property of this GitOperationState.
        :type current_branch: str

        :param head_commit_id:
            The value to assign to the head_commit_id property of this GitOperationState.
        :type head_commit_id: str

        :param is_detached:
            The value to assign to the is_detached property of this GitOperationState.
        :type is_detached: bool

        :param have_conflicts:
            The value to assign to the have_conflicts property of this GitOperationState.
        :type have_conflicts: bool

        :param time_checked:
            The value to assign to the time_checked property of this GitOperationState.
        :type time_checked: datetime

        """
        self.swagger_types = {
            'git_folder_path': 'str',
            'state': 'str',
            'is_blocking': 'bool',
            'is_allowed': 'bool',
            'message': 'str',
            'current_branch': 'str',
            'head_commit_id': 'str',
            'is_detached': 'bool',
            'have_conflicts': 'bool',
            'time_checked': 'datetime'
        }

        self.attribute_map = {
            'git_folder_path': 'gitFolderPath',
            'state': 'state',
            'is_blocking': 'isBlocking',
            'is_allowed': 'isAllowed',
            'message': 'message',
            'current_branch': 'currentBranch',
            'head_commit_id': 'headCommitId',
            'is_detached': 'isDetached',
            'have_conflicts': 'haveConflicts',
            'time_checked': 'timeChecked'
        }

        self._git_folder_path = None
        self._state = None
        self._is_blocking = None
        self._is_allowed = None
        self._message = None
        self._current_branch = None
        self._head_commit_id = None
        self._is_detached = None
        self._have_conflicts = None
        self._time_checked = None

    @property
    def git_folder_path(self):
        """
        **[Required]** Gets the git_folder_path of this GitOperationState.
        Folder path used to locate the git worktree.


        :return: The git_folder_path of this GitOperationState.
        :rtype: str
        """
        return self._git_folder_path

    @git_folder_path.setter
    def git_folder_path(self, git_folder_path):
        """
        Sets the git_folder_path of this GitOperationState.
        Folder path used to locate the git worktree.


        :param git_folder_path: The git_folder_path of this GitOperationState.
        :type: str
        """
        self._git_folder_path = git_folder_path

    @property
    def state(self):
        """
        **[Required]** Gets the state of this GitOperationState.
        Current git operation state detected.

        Allowed values for this property are: "CLEAN", "MERGE_IN_PROGRESS", "REBASE_IN_PROGRESS", "PULL_IN_PROGRESS", "DETACHED_HEAD", "UNKNOWN", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The state of this GitOperationState.
        :rtype: str
        """
        return self._state

    @state.setter
    def state(self, state):
        """
        Sets the state of this GitOperationState.
        Current git operation state detected.


        :param state: The state of this GitOperationState.
        :type: str
        """
        allowed_values = ["CLEAN", "MERGE_IN_PROGRESS", "REBASE_IN_PROGRESS", "PULL_IN_PROGRESS", "DETACHED_HEAD", "UNKNOWN"]
        if not value_allowed_none_or_none_sentinel(state, allowed_values):
            state = 'UNKNOWN_ENUM_VALUE'
        self._state = state

    @property
    def is_blocking(self):
        """
        **[Required]** Gets the is_blocking of this GitOperationState.
        Whether the detected state blocks typical write operations.


        :return: The is_blocking of this GitOperationState.
        :rtype: bool
        """
        return self._is_blocking

    @is_blocking.setter
    def is_blocking(self, is_blocking):
        """
        Sets the is_blocking of this GitOperationState.
        Whether the detected state blocks typical write operations.


        :param is_blocking: The is_blocking of this GitOperationState.
        :type: bool
        """
        self._is_blocking = is_blocking

    @property
    def is_allowed(self):
        """
        **[Required]** Gets the is_allowed of this GitOperationState.
        Whether the requested operation is allowed in the current state. If operationName is not provided, this indicates if the repository is in a generally safe state.


        :return: The is_allowed of this GitOperationState.
        :rtype: bool
        """
        return self._is_allowed

    @is_allowed.setter
    def is_allowed(self, is_allowed):
        """
        Sets the is_allowed of this GitOperationState.
        Whether the requested operation is allowed in the current state. If operationName is not provided, this indicates if the repository is in a generally safe state.


        :param is_allowed: The is_allowed of this GitOperationState.
        :type: bool
        """
        self._is_allowed = is_allowed

    @property
    def message(self):
        """
        Gets the message of this GitOperationState.
        Human-readable hint for UI display.


        :return: The message of this GitOperationState.
        :rtype: str
        """
        return self._message

    @message.setter
    def message(self, message):
        """
        Sets the message of this GitOperationState.
        Human-readable hint for UI display.


        :param message: The message of this GitOperationState.
        :type: str
        """
        self._message = message

    @property
    def current_branch(self):
        """
        Gets the current_branch of this GitOperationState.
        Current branch name. Empty if detached HEAD.


        :return: The current_branch of this GitOperationState.
        :rtype: str
        """
        return self._current_branch

    @current_branch.setter
    def current_branch(self, current_branch):
        """
        Sets the current_branch of this GitOperationState.
        Current branch name. Empty if detached HEAD.


        :param current_branch: The current_branch of this GitOperationState.
        :type: str
        """
        self._current_branch = current_branch

    @property
    def head_commit_id(self):
        """
        Gets the head_commit_id of this GitOperationState.
        Full commit id of HEAD.


        :return: The head_commit_id of this GitOperationState.
        :rtype: str
        """
        return self._head_commit_id

    @head_commit_id.setter
    def head_commit_id(self, head_commit_id):
        """
        Sets the head_commit_id of this GitOperationState.
        Full commit id of HEAD.


        :param head_commit_id: The head_commit_id of this GitOperationState.
        :type: str
        """
        self._head_commit_id = head_commit_id

    @property
    def is_detached(self):
        """
        Gets the is_detached of this GitOperationState.
        Whether HEAD is detached.


        :return: The is_detached of this GitOperationState.
        :rtype: bool
        """
        return self._is_detached

    @is_detached.setter
    def is_detached(self, is_detached):
        """
        Sets the is_detached of this GitOperationState.
        Whether HEAD is detached.


        :param is_detached: The is_detached of this GitOperationState.
        :type: bool
        """
        self._is_detached = is_detached

    @property
    def have_conflicts(self):
        """
        Gets the have_conflicts of this GitOperationState.
        Indicates if unmerged/conflicted files exist. This does not include file names.


        :return: The have_conflicts of this GitOperationState.
        :rtype: bool
        """
        return self._have_conflicts

    @have_conflicts.setter
    def have_conflicts(self, have_conflicts):
        """
        Sets the have_conflicts of this GitOperationState.
        Indicates if unmerged/conflicted files exist. This does not include file names.


        :param have_conflicts: The have_conflicts of this GitOperationState.
        :type: bool
        """
        self._have_conflicts = have_conflicts

    @property
    def time_checked(self):
        """
        Gets the time_checked of this GitOperationState.
        Time when the state was computed.


        :return: The time_checked of this GitOperationState.
        :rtype: datetime
        """
        return self._time_checked

    @time_checked.setter
    def time_checked(self, time_checked):
        """
        Sets the time_checked of this GitOperationState.
        Time when the state was computed.


        :param time_checked: The time_checked of this GitOperationState.
        :type: datetime
        """
        self._time_checked = time_checked

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other

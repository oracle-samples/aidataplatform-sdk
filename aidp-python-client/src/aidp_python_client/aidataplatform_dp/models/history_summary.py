# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class HistorySummary(object):
    """
    Summary information for a commit.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new HistorySummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param commit_id:
            The value to assign to the commit_id property of this HistorySummary.
        :type commit_id: str

        :param message:
            The value to assign to the message property of this HistorySummary.
        :type message: str

        :param author_name:
            The value to assign to the author_name property of this HistorySummary.
        :type author_name: str

        :param author_email:
            The value to assign to the author_email property of this HistorySummary.
        :type author_email: str

        :param time_created:
            The value to assign to the time_created property of this HistorySummary.
        :type time_created: datetime

        :param is_merge_commit:
            The value to assign to the is_merge_commit property of this HistorySummary.
        :type is_merge_commit: bool

        :param parents:
            The value to assign to the parents property of this HistorySummary.
        :type parents: list[str]

        """
        self.swagger_types = {
            'commit_id': 'str',
            'message': 'str',
            'author_name': 'str',
            'author_email': 'str',
            'time_created': 'datetime',
            'is_merge_commit': 'bool',
            'parents': 'list[str]'
        }

        self.attribute_map = {
            'commit_id': 'commitId',
            'message': 'message',
            'author_name': 'authorName',
            'author_email': 'authorEmail',
            'time_created': 'timeCreated',
            'is_merge_commit': 'isMergeCommit',
            'parents': 'parents'
        }

        self._commit_id = None
        self._message = None
        self._author_name = None
        self._author_email = None
        self._time_created = None
        self._is_merge_commit = None
        self._parents = None

    @property
    def commit_id(self):
        """
        **[Required]** Gets the commit_id of this HistorySummary.
        Commit SHA.


        :return: The commit_id of this HistorySummary.
        :rtype: str
        """
        return self._commit_id

    @commit_id.setter
    def commit_id(self, commit_id):
        """
        Sets the commit_id of this HistorySummary.
        Commit SHA.


        :param commit_id: The commit_id of this HistorySummary.
        :type: str
        """
        self._commit_id = commit_id

    @property
    def message(self):
        """
        **[Required]** Gets the message of this HistorySummary.
        First line of commit message (subject).


        :return: The message of this HistorySummary.
        :rtype: str
        """
        return self._message

    @message.setter
    def message(self, message):
        """
        Sets the message of this HistorySummary.
        First line of commit message (subject).


        :param message: The message of this HistorySummary.
        :type: str
        """
        self._message = message

    @property
    def author_name(self):
        """
        **[Required]** Gets the author_name of this HistorySummary.
        Commit author display name.


        :return: The author_name of this HistorySummary.
        :rtype: str
        """
        return self._author_name

    @author_name.setter
    def author_name(self, author_name):
        """
        Sets the author_name of this HistorySummary.
        Commit author display name.


        :param author_name: The author_name of this HistorySummary.
        :type: str
        """
        self._author_name = author_name

    @property
    def author_email(self):
        """
        Gets the author_email of this HistorySummary.
        Commit author email (optional).


        :return: The author_email of this HistorySummary.
        :rtype: str
        """
        return self._author_email

    @author_email.setter
    def author_email(self, author_email):
        """
        Sets the author_email of this HistorySummary.
        Commit author email (optional).


        :param author_email: The author_email of this HistorySummary.
        :type: str
        """
        self._author_email = author_email

    @property
    def time_created(self):
        """
        **[Required]** Gets the time_created of this HistorySummary.
        Commit authored time (or committed time if you prefer, but be consistent).


        :return: The time_created of this HistorySummary.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this HistorySummary.
        Commit authored time (or committed time if you prefer, but be consistent).


        :param time_created: The time_created of this HistorySummary.
        :type: datetime
        """
        self._time_created = time_created

    @property
    def is_merge_commit(self):
        """
        Gets the is_merge_commit of this HistorySummary.
        True if commit has multiple parents.


        :return: The is_merge_commit of this HistorySummary.
        :rtype: bool
        """
        return self._is_merge_commit

    @is_merge_commit.setter
    def is_merge_commit(self, is_merge_commit):
        """
        Sets the is_merge_commit of this HistorySummary.
        True if commit has multiple parents.


        :param is_merge_commit: The is_merge_commit of this HistorySummary.
        :type: bool
        """
        self._is_merge_commit = is_merge_commit

    @property
    def parents(self):
        """
        Gets the parents of this HistorySummary.
        Parent commit SHAs (empty for root commit). Present to explain merge commits.


        :return: The parents of this HistorySummary.
        :rtype: list[str]
        """
        return self._parents

    @parents.setter
    def parents(self, parents):
        """
        Sets the parents of this HistorySummary.
        Parent commit SHAs (empty for root commit). Present to explain merge commits.


        :param parents: The parents of this HistorySummary.
        :type: list[str]
        """
        self._parents = parents

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other

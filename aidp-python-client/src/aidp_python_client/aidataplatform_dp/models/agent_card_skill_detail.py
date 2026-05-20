# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AgentCardSkillDetail(object):
    """
    A single skill in the publish request.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new AgentCardSkillDetail object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param id:
            The value to assign to the id property of this AgentCardSkillDetail.
        :type id: str

        :param name:
            The value to assign to the name property of this AgentCardSkillDetail.
        :type name: str

        :param description:
            The value to assign to the description property of this AgentCardSkillDetail.
        :type description: str

        :param tags:
            The value to assign to the tags property of this AgentCardSkillDetail.
        :type tags: list[str]

        :param examples:
            The value to assign to the examples property of this AgentCardSkillDetail.
        :type examples: list[str]

        """
        self.swagger_types = {
            'id': 'str',
            'name': 'str',
            'description': 'str',
            'tags': 'list[str]',
            'examples': 'list[str]'
        }

        self.attribute_map = {
            'id': 'id',
            'name': 'name',
            'description': 'description',
            'tags': 'tags',
            'examples': 'examples'
        }

        self._id = None
        self._name = None
        self._description = None
        self._tags = None
        self._examples = None

    @property
    def id(self):
        """
        **[Required]** Gets the id of this AgentCardSkillDetail.
        Unique skill identifier.


        :return: The id of this AgentCardSkillDetail.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """
        Sets the id of this AgentCardSkillDetail.
        Unique skill identifier.


        :param id: The id of this AgentCardSkillDetail.
        :type: str
        """
        self._id = id

    @property
    def name(self):
        """
        **[Required]** Gets the name of this AgentCardSkillDetail.
        Display name of the skill.


        :return: The name of this AgentCardSkillDetail.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this AgentCardSkillDetail.
        Display name of the skill.


        :param name: The name of this AgentCardSkillDetail.
        :type: str
        """
        self._name = name

    @property
    def description(self):
        """
        Gets the description of this AgentCardSkillDetail.
        Description of what the skill does.


        :return: The description of this AgentCardSkillDetail.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this AgentCardSkillDetail.
        Description of what the skill does.


        :param description: The description of this AgentCardSkillDetail.
        :type: str
        """
        self._description = description

    @property
    def tags(self):
        """
        Gets the tags of this AgentCardSkillDetail.
        Optional tags for categorization/search.


        :return: The tags of this AgentCardSkillDetail.
        :rtype: list[str]
        """
        return self._tags

    @tags.setter
    def tags(self, tags):
        """
        Sets the tags of this AgentCardSkillDetail.
        Optional tags for categorization/search.


        :param tags: The tags of this AgentCardSkillDetail.
        :type: list[str]
        """
        self._tags = tags

    @property
    def examples(self):
        """
        Gets the examples of this AgentCardSkillDetail.
        Optional example prompts for this skill.


        :return: The examples of this AgentCardSkillDetail.
        :rtype: list[str]
        """
        return self._examples

    @examples.setter
    def examples(self, examples):
        """
        Sets the examples of this AgentCardSkillDetail.
        Optional example prompts for this skill.


        :param examples: The examples of this AgentCardSkillDetail.
        :type: list[str]
        """
        self._examples = examples

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
